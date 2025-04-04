package assignment01;

public class MainForComplex {
	public static void main(String[] args) {
		complexNumber r1 = new complexNumber(12,56);
		complexNumber r2 = new complexNumber(13,59);
		
		r1.swapNumber(r2);
//		System.out.println(r1);
		System.out.println(r1);
		System.out.println(r2);
		
		r1.addNumbers(r2);
		System.out.println(r1);
//		System.out.println(r2);
		r1.subtractNumbers(r2);
		System.out.println(r1);
		r1.multiply(r2);
		System.out.println(r1);
		
		
		
	}
}
