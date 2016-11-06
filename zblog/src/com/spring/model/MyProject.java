package com.spring.model;

public class MyProject {

	private int id;
	
	private String projectpid;
	
	private String projectname;
	
	private String projectproficiency;
	
	private String projectdescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectpid() {
		return projectpid;
	}

	public void setProjectpid(String projectpid) {
		this.projectpid = projectpid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getProjectproficiency() {
		return projectproficiency;
	}

	public void setProjectproficiency(String projectproficiency) {
		this.projectproficiency = projectproficiency;
	}

	public String getProjectdescription() {
		return projectdescription;
	}

	public void setProjectdescription(String projectdescription) {
		this.projectdescription = projectdescription;
	}

	@Override
	public String toString() {
		return "MyProject [id=" + id + ", projectpid=" + projectpid + ", projectname=" + projectname
				+ ", projectproficiency=" + projectproficiency + ", projectdescription=" + projectdescription + "]";
	}
	
	
}
