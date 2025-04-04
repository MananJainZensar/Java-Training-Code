package assignment04;

public class Employee implements Printable {
	private int empId;
	private String empName;
	
	public Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public void printAll() {
		System.out.println("The employee Id and Employee name are: "+ " " +empId + " " + empName);
	}
}
