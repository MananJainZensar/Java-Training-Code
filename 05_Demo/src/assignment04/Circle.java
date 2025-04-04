package assignment04;

public class Circle implements Printable {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public void printAll() {
		System.out.println("The radius of the Circle is: " + radius);
	}
	public double printArea() {
		double area = 3.14 * radius * radius;
		System.out.println("The area of the Circle is: " + area);
		return area;
	}
}
