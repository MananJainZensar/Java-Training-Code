package Abstraction;

public class MainForShape {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(12,89);
		Shape r2 = new Rectangle(24,56); //Here the Rectangle ie the Child class is Hidden hence abstraction(upcasting)
		r1.length = 12;
//		r2.length = 10;
		r2.area();
		r2.perimeter();
		r1.area();
		r1.perimeter();
		Circle c1 = new Circle(24);
		Shape c2 = new Circle(77);
		c1.area();
		c1.perimeter();
		c2.area();
		c2.perimeter();
		Cube c3 = new Cube(4);
		Shape c4 = new Cube(6);
		c3.area();
		c3.perimeter();
		c4.area();
		c4.perimeter();
		
	}
}
