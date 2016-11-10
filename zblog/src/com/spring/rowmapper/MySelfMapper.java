package com.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.MySelf;

public class MySelfMapper implements RowMapper<MySelf> {

	@Override
	public MySelf mapRow(ResultSet rs, int rownum) throws SQLException {
		MySelf mySelf = new MySelf();
		mySelf.setMyid(rs.getInt("myid"));
		mySelf.setAboutme(rs.getString("aboutme"));
		mySelf.setAddress(rs.getString("address"));
		mySelf.setAge(rs.getInt("age"));
		mySelf.setBirth(rs.getDate("birth"));
		mySelf.setBusinessphone(rs.getString("businessphone"));
		mySelf.setCourse(rs.getString("course"));
		mySelf.setLifephone(rs.getString("lifephone"));
		mySelf.setPortfolioid(rs.getInt("portfolioid"));
		mySelf.setProjectid(rs.getInt("projectid"));
		mySelf.setSchool(rs.getString("school"));
		mySelf.setSkillid(rs.getInt("skillid"));
		mySelf.setUserName(rs.getString("username"));
		mySelf.setEmail(rs.getString("email"));
		return mySelf;
	}

	
}
