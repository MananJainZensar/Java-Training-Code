package com.app;

public class subManager extends Manager{
	private double wages;
	public subManager (){
		
	}
	public subManager(int empId,String empName,double salary,double bonus, double wages) {
		super(empId,empName,salary,bonus);
		this.wages = wages;
	}
	
}
