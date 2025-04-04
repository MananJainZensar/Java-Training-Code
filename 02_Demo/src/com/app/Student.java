package com.app;

public class Student {
	private int rollNo;
	private String name;
	private double percent;
	
	private Course cource;
	public Student() {
		
	}
	public Student(int rollNo, String name, double percent, Course course) {
		this.rollNo = rollNo;
		this.name = name;
		this.percent = percent;
		this.cource = course;
	}
	public void setCourse(Course course) {
		this.cource=course;
		
	}
	public Course getCourse() {
		return this.cource;
	}
	@Override 
	public String toString() {
		return rollNo + " " + name + " " +  percent + " " + cource.toString();
	}

}
