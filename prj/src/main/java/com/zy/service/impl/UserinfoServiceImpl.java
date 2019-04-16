package com.zy.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.entity.Userinfo;
import com.zy.mapper.UserinfoMapper;
import com.zy.service.IUserinfoService;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
	@Resource
	private UserinfoMapper userinfoMapper;

	@Override
	public Userinfo login(Userinfo info) {
		// TODO Auto-generated method stub
		return userinfoMapper.login(info);
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByExample(null);
	}

	@Override
	public void save(Userinfo info, Integer[] rids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Userinfo info, Integer[] rids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Userinfo findById(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lock(Userinfo info) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlock(Userinfo info) {
		// TODO Auto-generated method stub
		
	}

}
