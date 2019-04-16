package com.zy.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zy.entity.Userinfo;
import com.zy.service.IUserinfoService;

@Controller
public class LoginController {
	@Resource
	private IUserinfoService userinfoServiceImpl;
	
	@RequestMapping("login")
	public String login(Userinfo info,ModelMap map,HttpSession session) throws JsonProcessingException {
		info = userinfoServiceImpl.login(info);
		if(info!=null)
		{
			List trees = info.getTrees();
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(trees);
			map.put("json", json);
			
			session.setAttribute("userinfo", info);
			session.setAttribute("json", json);
			System.out.println("zzzzz");
			return "redirect:admin/index.jsp";
		}else {
			return "redirect:index.jsp";
		}
	}
	
}
