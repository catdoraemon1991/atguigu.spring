package com.atguigu.ioc.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("life.xml");
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("life.xml");
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("life.xml");
		Person person = ac.getBean("person", Person.class);
		
		
		System.out.println(person);
		
		
		ac.close();
	}
	
}
