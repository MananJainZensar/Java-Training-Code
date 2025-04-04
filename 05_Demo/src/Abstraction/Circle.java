package Abstraction;

public class Circle extends Shape{
	private double radius;
	private static double pi; 
//	private static double length;
	
	static {
		pi = 3.14;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public void area() {
		System.out.println("The area od Circle is: " + pi*this.radius*this.radius);
	}
	public void perimeter() {
		System.out.println("The perimeter of Circle is: " + 2*pi*this.radius);
	}
}
