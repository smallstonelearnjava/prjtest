package com.zy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zy.entity.Role;
import com.zy.entity.RoletreeExample;
import com.zy.entity.RoletreeKey;
import com.zy.mapper.RoleMapper;
import com.zy.mapper.RoletreeMapper;
import com.zy.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private RoletreeMapper roletreeMapper;
	
	@Override
	@Transactional(readOnly=true)
	public List findAll() {
		// TODO Auto-generated method stub
		return roleMapper.selectByExample(null);
	}

	@Override
	@Transactional
	public void save(Role role, String[] tids) {
		// TODO Auto-generated method stub
		roleMapper.insert(role);
		
		//插入roleTree表
		for (String tid : tids) {
			RoletreeKey key = new RoletreeKey();
			key.setRid(role.getRid());
			key.setTid(Integer.parseInt(tid));
			roletreeMapper.insert(key);
		}
	}

	@Override
	@Transactional
	public void update(Role role, String[] tids) {
		// TODO Auto-generated method stub
		roleMapper.updateByPrimaryKey(role);
		
		// 先删再加
		RoletreeExample example = new RoletreeExample();
		example.createCriteria().andRidEqualTo(role.getRid());
		roletreeMapper.deleteByExample(example);
		
		//插入roleTree表
		for (String tid : tids) {
			RoletreeKey key = new RoletreeKey();
			key.setRid(role.getRid());
			key.setTid(Integer.parseInt(tid));
			roletreeMapper.insert(key);
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Role findById(Integer rid) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(rid);
	}

}
