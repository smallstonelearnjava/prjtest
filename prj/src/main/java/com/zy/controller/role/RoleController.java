package com.zy.controller.role;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zy.entity.Role;
import com.zy.service.IRoleService;
import com.zy.service.ITreeService;

@Controller
@RequestMapping("/admin/role")
public class RoleController {
	@Resource
	private IRoleService roleServiceImpl;
	@Resource
	private ITreeService treeServiceImpl;
	
	@RequestMapping("/findAll")
	public String findAll(ModelMap map) {
		List list = roleServiceImpl.findAll();
		map.put("list", list);
		return "/admin/role/list";
	}
	
	@RequestMapping("/save")
	public String save(Role role,String tids) {
		String[] tidsarray = tids.split(",");
		roleServiceImpl.save(role,tidsarray);
		return "redirect:/admin/role/findAll";
	}
	
	@RequestMapping("/update")
	public String update(Role role, String tids) {
		String[] tidsarray = tids.split(",");
		roleServiceImpl.update(role,tidsarray);
		return "redirect:/admin/role/findAll";
	}
	
	@RequestMapping("/findById")
	public String findById(ModelMap map, Integer rid) {
		Role role = roleServiceImpl.findById(rid);
		map.put("role", role);
		return "forward:goInput";
	}
	
	@RequestMapping("/goInput")
	public String goInput(ModelMap map) throws JsonProcessingException {
		List list = treeServiceImpl.findAll();
		ObjectMapper mapper = new ObjectMapper();
		String alltree = mapper.writeValueAsString(list);
		map.put("alltree", alltree);
		return "/admin/role/input";
	}
}
