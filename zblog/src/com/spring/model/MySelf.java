package com.spring.model;

import java.util.Date;

public class MySelf {

	private int myid;
	
	private String UserName;
	
	private int age;
	
	private Date birth;
	
	private int businessphone;
	
	private int lifephone;
	
	private String address;
	
	private String school;
	
	private String course;
	
	private String aboutme;
	
	private int skillid;
	
	private int projectid;
	
	private int portfolioid;

	public int getMyid() {
		return myid;
	}

	public void setMyid(int myid) {
		this.myid = myid;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getBusinessphone() {
		return businessphone;
	}

	public void setBusinessphone(int businessphone) {
		this.businessphone = businessphone;
	}

	public int getLifephone() {
		return lifephone;
	}

	public void setLifephone(int lifephone) {
		this.lifephone = lifephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAboutme() {
		return aboutme;
	}

	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}

	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public int getPortfolioid() {
		return portfolioid;
	}

	public void setPortfolioid(int portfolioid) {
		this.portfolioid = portfolioid;
	}

	@Override
	public String toString() {
		return "MySelf [myid=" + myid + ", UserName=" + UserName + ", age=" + age + ", birth=" + birth
				+ ", businessphone=" + businessphone + ", lifephone=" + lifephone + ", address=" + address + ", school="
				+ school + ", course=" + course + ", aboutme=" + aboutme + ", skillid=" + skillid + ", projectid="
				+ projectid + ", portfolioid=" + portfolioid + "]";
	}
	
	
}
