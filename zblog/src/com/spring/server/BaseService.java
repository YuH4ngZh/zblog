package com.spring.server;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.daoimp.MySelfDaoImp;

public class BaseService   {

	private static ApplicationContext context =new ClassPathXmlApplicationContext("classpath:springjdbc.xml");  
	
	public static MySelfDaoImp getMySelfDaoImp(){
		return (MySelfDaoImp) context.getBean("MySelfDaoImp");
	}
	
		
}
