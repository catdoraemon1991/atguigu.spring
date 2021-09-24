package com.atguigu.ioc.userMod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.ioc.userMod.service.UserService;

@Controller(value="userController")
public class UserController {
	
	@Autowired(required=false)
	private UserService userService;
	
	public void addUser() {
		userService.addUser();
	}

	public UserController() {
		System.out.println("UserController");
	}

	
	
	
}
