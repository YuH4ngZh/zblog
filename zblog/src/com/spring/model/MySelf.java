package com.spring.model;

import java.util.Date;

public class MySelf {

	private int myid;
	
	private String userName;
	
	private int age;
	
	private Date birth;
	
	private String businessphone;
	
	private String lifephone;
	
	private String address;
	
	private String school;
	
	private String course;
	
	private String aboutme;
	
	private String email;
	
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
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getBusinessphone() {
		return businessphone;
	}

	public void setBusinessphone(String businessphone) {
		this.businessphone = businessphone;
	}

	public String getLifephone() {
		return lifephone;
	}

	public void setLifephone(String lifephone) {
		this.lifephone = lifephone;
	}

	@Override
	public String toString() {
		return "MySelf [myid=" + myid + ", UserName=" + userName + ", age=" + age + ", birth=" + birth
				+ ", businessphone=" + businessphone + ", lifephone=" + lifephone + ", address=" + address + ", school="
				+ school + ", course=" + course + ", aboutme=" + aboutme + ", skillid=" + skillid + ", projectid="
				+ projectid + ", portfolioid=" + portfolioid + "]";
	}


	
	
}
