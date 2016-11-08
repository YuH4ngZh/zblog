package com.spring.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.MySelfDao;
import com.spring.daoimp.MySelfDaoImp;
import com.spring.model.MySelf;

public class MySelfServer {

	ApplicationContext context =new ClassPathXmlApplicationContext("classpath:springjdbc.xml");  
    MySelfDaoImp mySelfDaoImp = (MySelfDaoImp)context.getBean("MySelfDaoImp");  
	public MySelf getMySelf() {
		MySelf mySelf = mySelfDaoImp.selectMyself();
		
		return mySelf;
			
	}
}
