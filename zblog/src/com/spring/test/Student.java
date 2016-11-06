package com.spring.test;

public class Student {

    private String ID;  
    private String name;  
    private int age;  
    private String FM;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFM() {
		return FM;
	}
	public void setFM(String fM) {
		FM = fM;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", age=" + age + ", FM=" + FM + "]";
	}
    
    
}
