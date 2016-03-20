package com.seawave.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.seawave.dao.IUserDao;
import com.seawave.entity.UserT;
import com.seawave.service.IUserService;

@Service("userService") 
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public UserT getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}
	
	public void insertUser(UserT user) {
		userDao.insert(user);
	}
}
