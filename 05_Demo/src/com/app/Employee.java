package com.app;
 
public abstract class Employee {
	private int empId;
	private String empName;
	private double salary;
 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
 
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	// getter and setter
 
	public String toString() {
		return empId + " " + empName + " " + salary;
	}
 
//	public void printTotalSalary() {
//		System.out.println("Total salary : " + this.salary);
//	}
	public abstract void printTotalSalary();
 
	public double getSalary() {
		return this.salary;
	}
 
	public boolean equals(Employee e) {
		if (this.empId == e.empId && this.empName.equals(e.empName) && this.salary == e.salary) {
			return true;
		} else
			return false;
 
	}
	public int hashCode() {
		return empId*789654;
	}
	@Override
	protected void finalize()  throws Throwable{
		System.out.println("Clean Up Code Executed");
	}
 
}