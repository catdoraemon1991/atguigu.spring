package com.atguigu.spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans-di.xml");
		Student s1 = ac.getBean("s1", Student.class);
		Student s2 = ac.getBean("s2", Student.class);
		Student s3 = ac.getBean("s3", Student.class);
		Student s4 = ac.getBean("s4", Student.class);
		Student s5 = ac.getBean("s5", Student.class);
		Student s6 = ac.getBean("s6", Student.class);
		Student s7 = ac.getBean("s7", Student.class);
		
		Teacher t2 = ac.getBean("t2", Teacher.class);
		Teacher t3 = ac.getBean("t3", Teacher.class);
		Teacher t4 = ac.getBean("t4", Teacher.class);
		Teacher t5 = ac.getBean("t5", Teacher.class);
		
		List<Student> student = ac.getBean("students", List.class);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(student);
		
	}

}
