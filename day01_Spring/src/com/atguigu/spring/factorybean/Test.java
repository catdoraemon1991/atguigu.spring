package com.atguigu.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("factory-bean.xml");
		
		Car car1 = ac.getBean("factory", Car.class);
		Car car2 = (Car) ac.getBean("factory");
		
		System.out.println(car1);
		System.out.println(car2);
	}

}
