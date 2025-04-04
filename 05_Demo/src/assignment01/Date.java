package assignment01;

public class Date {
	private int Day;
	private int Month;
	private int Year;
	
	public Date() {
		
	}
	public Date(int Day, int Month, int Year) {
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int Month) {
		this.Month = Month;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int Year) {
		this.Year = Year;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int Day) {
		this.Day = Day;
	}
	@Override
	public String toString() {
		return "Date [" + Day + "/ " + Month + "/ " + Year + "]";
	}
	void swapDate(Date d) {
		int tempDay;
		int tempMonth;
		int tempYear;
		
		tempDay = d.Day;
		tempMonth = d.Month;
		tempYear = d.Year;
		
		d.Day = this.Day;
		d.Month = this.Month;
		d.Year = this.Year;
		
		this.Day = tempDay;
		this.Month = tempMonth;
		this.Year = tempYear;
	}

}
