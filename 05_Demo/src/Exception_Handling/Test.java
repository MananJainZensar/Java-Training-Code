package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int marks[] = {10,20,30,40,50};
		System.out.println(marks);
		try {
			for(int i = 0 ; i<5;i++) {
				System.out.println(marks[i]);	
			}
			
			System.out.println("Will not print anything in try blog after exception is caught");
			System.out.println("Enter your age: ");
			Scanner s = new Scanner(System.in);
			int age = s.nextInt();
			System.out.println(age);
		}
		
		catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println("Good Morning");
			ex.printStackTrace();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
//		finally{
//			System.out.println("Enter your age: ");
//			Scanner s = new Scanner(System.in);
//			int age = s.nextInt();
//			System.out.println(age);
//		}

	}
}
