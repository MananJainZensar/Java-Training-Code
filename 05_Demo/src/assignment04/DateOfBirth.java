package assignment04;

import java.util.Objects;

public class DateOfBirth implements Cloneable {
	private int Day;
	private int Month;
	private int Year;
	
	public DateOfBirth(int Day, int Month, int Year) {
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "DateOfBirth [Day=" + Day + ", Month=" + Month + ", Year=" + Year + "]";
	}
	public int hashCode() {
		return Objects.hash(Day,Month,Year);
	}
	
	
	
}
