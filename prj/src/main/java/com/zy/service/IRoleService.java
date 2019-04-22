package com.zy.service;

import java.util.List;

import com.zy.entity.Role;

public interface IRoleService {
	public List findAll();
	public void save(Role role, String[] tids);
	public void update(Role role, String[] tids);
	public Role findById(Integer rid);
}
