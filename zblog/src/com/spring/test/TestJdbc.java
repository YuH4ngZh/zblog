package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.daoimp.MySelfDaoImp;
import com.spring.server.MySelfServer;

public class TestJdbc {
	
	public static void main(String args[]) {
		test3();
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
		MySelfServer mySelfServer =new MySelfServer();
		System.out.println(mySelfServer.getMySelf());
	}
	
}
