package assignment03;

public  abstract class question1 {
	
	abstract int getSum();
	abstract int getSubtract();
	
	
}
class getDetails extends question1 {
	private int a;
	private int b;
	public getDetails(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getSum() {
		return a - b;
	}
	public int getSubtract() {
		return a - b;
	}
}

