package com.atguigu.ioc.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		Person person = (Person) bean;
		if(person.getGender().equals("male")) {
			person.setName("Zhang wu ji");
		}else {
			person.setName("Zhao min");
		}
		System.out.println("2.5 post process before initialization");
		return person;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("3.5 post process after initialization");
		return bean;
	}


}
