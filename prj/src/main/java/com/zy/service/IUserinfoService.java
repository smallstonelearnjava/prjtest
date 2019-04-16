package com.zy.service;

import java.util.List;

import com.zy.entity.Userinfo;

public interface IUserinfoService {
	public Userinfo login(Userinfo info);
	public List findAll();
	public void save(Userinfo info,Integer[] rids);
	public void update(Userinfo info,Integer[] rids);
	public Userinfo findById(Integer uid);
	public void lock(Userinfo info);
	public void unlock(Userinfo info);
}
