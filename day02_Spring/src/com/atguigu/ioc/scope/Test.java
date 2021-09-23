package com.atguigu.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		Student s11 = ac.getBean("student", Student.class);
		Student s12 = ac.getBean("student", Student.class);
		Student s21 = ac.getBean("s2", Student.class);
		Student s22 = ac.getBean("s2", Student.class);
		
		
		System.out.println(s11);
		System.out.println(s11 == s12);
		System.out.println(s21 == s22);
		
	}
}
