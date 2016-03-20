package com.seawave.service;

import com.seawave.entity.UserT;

public interface IUserService {
	public UserT getUserById(int userId); 
	
	public void insertUser(UserT user);
}
