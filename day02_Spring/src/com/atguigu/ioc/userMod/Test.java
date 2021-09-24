package com.atguigu.ioc.userMod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.ioc.userMod.controller.UserController;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");
		
		UserController uc = ac.getBean("userController", UserController.class);
		
		System.out.println(uc);
		
//		uc.addUser();
		
	}
	

}
