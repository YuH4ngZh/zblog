package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbc {
	
	public static void main(String args[]) {
		ApplicationContext context =new ClassPathXmlApplicationContext("classpath:springjdbc.xml");  
        StudentDaoImp studentDaoImp = (StudentDaoImp)context.getBean("studentDaoImp");  
        System.out.println(studentDaoImp.allstudent());
	}
}
