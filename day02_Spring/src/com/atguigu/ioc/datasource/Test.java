package com.atguigu.ioc.datasource;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("datasource.xml");
		DruidDataSource bean = ac.getBean("datasource", DruidDataSource.class);
		DruidDataSource bean2 = ac.getBean("d2", DruidDataSource.class);
		
		System.out.println(bean);
		System.out.println(bean2);
		
	}
	
}
