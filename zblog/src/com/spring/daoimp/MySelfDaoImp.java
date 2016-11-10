package com.spring.daoimp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.MySelfDao;
import com.spring.model.MySelf;
import com.spring.rowmapper.MySelfMapper;
import com.spring.test.StudentMapper;

public class MySelfDaoImp implements MySelfDao {

	private static DataSource datasource;
	private static JdbcTemplate jdbcTemplateObject;
			
    public void setDatasource(DataSource ds) {  
        this.datasource = ds;  
        this.jdbcTemplateObject = new JdbcTemplate(datasource);       
    }  
    
	public static MySelf selectMyself() {
		List<MySelf> list= null;
		String sql = "select * from my_self";
		list = jdbcTemplateObject.query(sql, new MySelfMapper()); 
		return list.get(0);
	}

}
