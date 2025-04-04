package Abstraction;

public class Rectangle extends Shape {
	public double length;
	public double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("The area of Rectangle is: " + this.length*this.breadth);
	}
	public void perimeter() {
		System.out.println("The perimeter of Rectangle is: "+ (2*(this.length + this.breadth)));
	}
}

