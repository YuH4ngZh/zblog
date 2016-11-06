package com.spring.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rownum) throws SQLException {
        Student student = new Student();  
        student.setID(rs.getString("ID"));  
        student.setName(rs.getString("name"));  
        student.setAge(rs.getInt("age"));  
        student.setFM(rs.getString("FM"));  
          
        return student;
	}

	
}
