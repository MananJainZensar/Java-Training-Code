package assignment04;

import java.util.Objects;

public class EmployeeForClone implements Cloneable {
	private int empId;
	private String empName;
	private double Salary;
	private DateOfBirth date_of_birth;
	
	public EmployeeForClone(int empId, String empName, double Salary, DateOfBirth date_of_birth) {
		this.empId = empId;
		this.empName = empName;
		this.Salary = Salary;
		this.date_of_birth = date_of_birth;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		EmployeeForClone clonned = (EmployeeForClone) super.clone();
//		DateOfBirth clonnedCopy = (DateOfBirth) this.date_of_birth.clone();
//		clonned.setDate_of_birth(clonnedCopy);
//		return clonned;
		return super.clone();
	}

	public DateOfBirth getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(DateOfBirth date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "EmployeeForClone [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + ", date_of_birth="
				+ date_of_birth + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(empId,date_of_birth,empName,Salary);
	}
	
	
	
	
	
}
