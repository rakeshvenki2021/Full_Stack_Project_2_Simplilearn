package com.simplilearn.bean;

public class Students {

	private int id,age, aclass;
	private String fname,lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAclass() {
		return aclass;
	}
	public void setAclass(int aclass) {
		this.aclass = aclass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", age=" + age + ", aclass=" + aclass + ", fname=" + fname + ", lname=" + lname
				+ "]";
	}
	
	
	
}