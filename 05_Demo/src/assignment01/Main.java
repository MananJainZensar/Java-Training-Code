package assignment01;

public class Main {
	public static void main(String[] args) {
		Date d1 = new Date(12,3,2024);
		Date d2 = new Date(13,4,2025);
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("After Swapping");
		d1.swapDate(d2);
		System.out.println(d1);
		System.out.println(d2);
	}
}
