package com.spring.test;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImp implements StudentDao {
 
	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObject;
	
    public void setDatasource(DataSource ds) {  
        this.datasource = ds;  
        this.jdbcTemplateObject = new JdbcTemplate(datasource);       
    }  
	
	@Override
    public List<Student> allstudent() {  
        List<Student> students = null;  
        String sql = "SELECT * FROM student";  
        students = jdbcTemplateObject.query(sql, new StudentMapper());  
        return students;  
    }  
    
}
