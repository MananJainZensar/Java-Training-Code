package Abstraction;

public class Cube extends Shape{
	private double face;
	
	public Cube(double face) {
		this.face = face;
	}
	public void area() {
		System.out.println("The area of cube is: " + 6*(this.face*this.face));
	}
	public void perimeter() {
		System.out.println("The perimeter of Cube is: " + 12*this.face);
	}
}
