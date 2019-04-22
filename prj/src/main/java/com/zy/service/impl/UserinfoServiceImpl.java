package com.zy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zy.entity.Userinfo;
import com.zy.entity.UserinforoleExample;
import com.zy.entity.UserinforoleKey;
import com.zy.mapper.UserinfoMapper;
import com.zy.mapper.UserinforoleMapper;
import com.zy.service.IUserinfoService;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
	@Resource
	private UserinfoMapper userinfoMapper;
	@Resource
	private UserinforoleMapper userinforoleMapper;

	@Override
	@Transactional
	public Userinfo login(Userinfo info) {
		// TODO Auto-generated method stub
		return userinfoMapper.login(info);
	}

	@Override
	@Transactional(readOnly = true)
	public List findAll() {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByExample(null);
	}

	@Override
	@Transactional
	public void save(Userinfo info, Integer[] rids) {
		// TODO Auto-generated method stub
		userinfoMapper.insert(info);
		if (rids != null) {
			for (Integer rid : rids) {
				UserinforoleKey key = new UserinforoleKey();
				key.setUid(info.getUid());
				key.setRid(rid);
				userinforoleMapper.insert(key);
			}
		}
	}

	@Override
	@Transactional
	public void update(Userinfo info, Integer[] rids) {
		// TODO Auto-generated method stub
		userinfoMapper.updateByPrimaryKey(info);
		// 先删再加
		UserinforoleExample example = new UserinforoleExample();
		example.createCriteria().andUidEqualTo(info.getUid());
		userinforoleMapper.deleteByExample(example);
		// 先删再加
		if (rids != null) {
			for (Integer rid : rids) {
				UserinforoleKey key = new UserinforoleKey();
				key.setUid(info.getUid());
				key.setRid(rid);
				userinforoleMapper.insert(key);
			}
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Userinfo findById(Integer uid) {
		// TODO Auto-generated method stub
		return userinfoMapper.selectByPrimaryKey(uid);
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
