package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.daoimp.MySelfDaoImp;
import com.spring.server.MySelfService;

public class TestJdbc {
	@Autowired
	private static MySelfService mySelfServer ;
	
	public static void main(String args[]) {

		System.out.println(mySelfServer.getMySelf());
	}
	
	public static void test1() {
		ApplicationContext context =new ClassPathXmlApplicationContext("classpath:springjdbc.xml");  
        StudentDaoImp studentDaoImp = (StudentDaoImp)context.getBean("studentDaoImp");  
        System.out.println(studentDaoImp.allstudent());
	}
	
	public static void test2() {
		ApplicationContext context =new ClassPathXmlApplicationContext("classpath:springjdbc.xml");  
        MySelfDaoImp mySelfDaoImp = (MySelfDaoImp)context.getBean("MySelfImp");  
        System.out.println(mySelfDaoImp.selectMyself());
		
	}
	
	public static void test3() {

	}
	
}
