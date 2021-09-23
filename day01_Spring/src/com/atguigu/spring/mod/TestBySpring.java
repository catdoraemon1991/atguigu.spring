package com.atguigu.spring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initializing container
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get by ID
		//Person person1 = (Person) ac.getBean("person1");
		
		// get by class, No relationship with ID, id is optional
		// There should be no duplication of the same class in xml!
		//Person person2 = ac.getBean(Person.class);
		
		// Commonly used method
		Person person3 = ac.getBean("person2", Person.class);
		
		System.out.println(person3);
		
		ac.close();
	}

}
