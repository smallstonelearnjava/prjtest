package com.zy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.mapper.TreeMapper;
import com.zy.service.ITreeService;

@Service
public class TreeServiceImpl implements ITreeService {
	@Resource
	private TreeMapper treeMapper;
	
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return treeMapper.selectByExample(null);
	}

}
