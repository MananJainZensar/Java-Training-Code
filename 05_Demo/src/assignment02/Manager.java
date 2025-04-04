package assignment02;

public class Manager extends Employee {
	private int bonus;
	public Manager(int empId, String empName,int perHourIncome, int totalHoursWorking, int totalWorkingDays,int bonus) {
		super(empId, empName, perHourIncome, totalHoursWorking,totalWorkingDays);
		this.bonus = bonus;
	}
	@Override
	public int printSalary() {
		int finalSalaryManager = (super.perHourIncome * super.totalHoursWorking * super.totalWorkingDays) + bonus;
		System.out.println(finalSalaryManager);
		return finalSalaryManager;
	}
	@Override
	public String toString() {
	    return "Manager: " + super.empName + " " + bonus;
	}
}
