package com.app;

public class Course {
	private int id;
	private String name;
	private int duration;
	public Course() {
		
	}
	public Course (int id, String name, int duration) {
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	public String toString() {
		return id + "" + name + "" + duration;
	}
}
