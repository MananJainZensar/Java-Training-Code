package assignment02;

public class Employee {
	private int empId;
	protected String empName;
	protected int perHourIncome;
	protected int totalHoursWorking;
	protected int totalWorkingDays;
	
	public Employee(int empId, String empName,int perHourIncome, int totalHoursWorking, int totalWorkingDays) {
		this.empId = empId;
		this.empName = empName;
		this.perHourIncome = perHourIncome;
		this.totalHoursWorking = totalHoursWorking;
		this.totalWorkingDays = totalWorkingDays;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getPerHourIncome() {
		return perHourIncome;
	}

	public void setPerHourIncome(int perHourIncome) {
		this.perHourIncome = perHourIncome;
	}

	public int getTotalHoursWorking() {
		return totalHoursWorking;
	}

	public void setTotalHoursWorking(int totalHoursWorking) {
		this.totalHoursWorking = totalHoursWorking;
	}

	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}

	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", perHourIncome=" + perHourIncome
				+ ", totalHoursWorking=" + totalHoursWorking + ", totalWorkingDays=" + totalWorkingDays + "]";
	}
	public int printSalary() {
		int finalSalary = perHourIncome * totalWorkingDays * totalHoursWorking;
		System.out.println(finalSalary);
		return finalSalary;
	}
	
}
