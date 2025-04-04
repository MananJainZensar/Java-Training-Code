package com.app;

public class Manager extends Employee{ // Manager is derived class(child)
	// Employee is base class(parent class)
	
	private double bonus;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(int empId,String empName,double salary,double bonus)
	{
		super(empId,empName,salary); // must be first line
		this.bonus=bonus;
		
	}
	public String toString() {
		return super.toString()+" "+this.bonus;
	}
	
	@Override
	public void printTotalSalary() {
		System.out.println("Total salary of Manager : "+(getSalary()+bonus));
	}
	public void printBonus() {
		System.out.println("Bonus for Manager : "+this.bonus);
	}
	
}
