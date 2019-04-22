package com.zy.controller.userinfo;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.entity.Userinfo;
import com.zy.service.IRoleService;
import com.zy.service.IUserinfoService;

@Controller
@RequestMapping("/admin/userinfo")
public class UserinfoController {
	@Resource
	private IUserinfoService userinfoServiceImpl;
	@Resource
	private IRoleService roleServiceImpl;
	
	@RequestMapping("/findAll")
	public String findAll(ModelMap map) {
		List list = userinfoServiceImpl.findAll();
		map.put("list", list);
		return "/admin/userinfo/list";
	}
	
	@RequestMapping("/goInput")
	public String goInput(ModelMap map) {
		List roles = roleServiceImpl.findAll();
		map.put("roles", roles);
		return "/admin/userinfo/input";
	}
	
	@RequestMapping("/findById")
	public String findById(Integer uid,ModelMap map) {
		Userinfo info = userinfoServiceImpl.findById(uid);
		map.put("info", info);
		return "forward:goInput";
	}
	
	@RequestMapping("/save")
	public String save(Userinfo info,Integer[] rids,ModelMap map) {
		userinfoServiceImpl.save(info, rids);
		return "redirect:/admin/userinfo/findAll";
	}
	
	@RequestMapping("/update")
	public String update(Userinfo info,Integer[] rids,ModelMap map) {
		userinfoServiceImpl.update(info, rids);
		return "redirect:/admin/userinfo/findAll";
	}
}
