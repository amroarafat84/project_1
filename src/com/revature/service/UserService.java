package com.revature.service;

import com.revature.dto.User;
import com.revature.impDao.ImpUser;

public class UserService {
	
	private ImpUser userImp = new ImpUser();
	
	public User getUserByUserName(String userName) {
		return userImp.getUserByUserName(userName);
	}

}
