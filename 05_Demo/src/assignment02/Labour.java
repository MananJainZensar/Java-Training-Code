package assignment02;

public class Labour extends Employee {
	private int overTime;
	private int overTimeIncentive;
	
	public Labour(int empId, String empName,int perHourIncome, int totalHoursWorking, int totalWorkingDays,int overTime, int overTimeIncentive) {
		super(empId,empName,perHourIncome, totalHoursWorking,totalWorkingDays);
		this.overTime = overTime;
		this.overTimeIncentive = overTimeIncentive;
	}
	@Override
	public int printSalary() {
		int finalLabourSalary = (super.perHourIncome * super.totalHoursWorking * super.totalWorkingDays) + (overTime * overTimeIncentive);
		System.out.println(finalLabourSalary);
		return finalLabourSalary;
	}
	@Override
	public String toString() {
		return super.empName + "Labour [overTime=" + overTime + ", overTimeIncentive=" + overTimeIncentive + "]";
	}
	
}

