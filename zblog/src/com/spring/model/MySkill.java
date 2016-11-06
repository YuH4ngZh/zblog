package com.spring.model;

public class MySkill {

	private int id;
	
	private String skillpid;
	
	private String skillname;
	
	private String skillproficiency;
	
	private String skilldescriprion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillpid() {
		return skillpid;
	}

	public void setSkillpid(String skillpid) {
		this.skillpid = skillpid;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public String getSkillproficiency() {
		return skillproficiency;
	}

	public void setSkillproficiency(String skillproficiency) {
		this.skillproficiency = skillproficiency;
	}

	public String getSkilldescriprion() {
		return skilldescriprion;
	}

	public void setSkilldescriprion(String skilldescriprion) {
		this.skilldescriprion = skilldescriprion;
	}

	@Override
	public String toString() {
		return "MySkill [id=" + id + ", skillpid=" + skillpid + ", skillname=" + skillname + ", skillproficiency="
				+ skillproficiency + ", skilldescriprion=" + skilldescriprion + "]";
	}
	
	
}
