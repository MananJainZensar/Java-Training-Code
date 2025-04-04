package com.app;

public class ComposistionTest {
	public static void main(String[] args) {
		Course java = new Course(201,"Java",3);
		Course spring = new Course (207,"Spring",4);
		Course sql = new Course(204,"SQL",1);
		
		Student s1=new Student(101, "Venkat", 89.65, java);
		Student s2=new Student(505, "Raman", 78.56, spring);
		
		Student s3=new Student(509, "Virat", 85.85,null);
		s3.setCourse(sql);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
