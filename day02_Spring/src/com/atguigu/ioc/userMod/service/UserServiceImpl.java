package com.atguigu.ioc.userMod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.ioc.userMod.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		userDao.addUser();
	}

}
