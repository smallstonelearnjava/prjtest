package com.zy.controller.userinfo;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.service.IUserinfoService;

@Controller
@RequestMapping("/userinfo")
public class UserinfoController {
	@Resource
	private IUserinfoService userinfoServiceImpl;
	
//	@RequestMapping("/findAll")
//	public String findAll() {
//		List list = userinfoServiceImpl.findAll();
//	}
}
