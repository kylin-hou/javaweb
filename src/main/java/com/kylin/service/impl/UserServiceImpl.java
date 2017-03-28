package com.kylin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kylin.dao.UserMapper;
import com.kylin.model.User;
import com.kylin.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userDao;
	
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userId);
	}
	
}
