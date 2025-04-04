package com.app;

public class GCTest {
	public static void main(String [] args) {
//		Employee e1 = new Employee(101, "Venkat", 45678.25);
//		Employee e2 = e1;
//		Employee e3 = e1;
//		
//		System.out.println(e1);
//		e1 = null;
//		System.out.println("When e1 is null");
//		System.out.println(e2);
//		System.out.println(e3);
//		System.out.println(e1);
//		e2 = null;
//		System.out.println("When e2 is null");
//		System.out.println(e3);
//		System.out.println(e2);
//		System.out.println(e3);
//		e3 = null;
//		System.out.println("When e3 is null");
//		System.out.println(e3);
//		System.out.println(e1);
//		System.out.println(e2);
//		
		System.gc();
//		
//		Employee m1 = new Manager(101,"Manan", 3323.45);
		Employee m1 = new Manager(101, "Manan",4537,56);
		Employee m2 = new Manager(102,"Himani", 2232,38);
		Employee m3 = new Manager(103,"Ashish", 2378,182);
		Employee m4 = new Manager(103,"Shikha",2739,27);
		
		System.out.println(m1);
		m1 = null;
		m2 = m1;
		System.out.println(m1);
		System.out.println(m2);
		
		
		
		
	}
	
	// Garbage collector: To remove unreferenced object and free the
	
	
}
