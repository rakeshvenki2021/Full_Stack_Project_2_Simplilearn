package com.simplilearn.bean;

public class Subjects {

	private int id;
	private String name,shortcuts;
	@Override
	public String toString() {
		return "Subjects [id=" + id + ", name=" + name + ", shortcuts=" + shortcuts + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortcuts() {
		return shortcuts;
	}
	public void setShortcuts(String shortcuts) {
		this.shortcuts = shortcuts;
	}
	
	
}