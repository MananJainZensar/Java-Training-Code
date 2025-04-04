import java.util.Scanner;
 
public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=s.nextInt();
		try {
			AgeValidator.validateAge(age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thank you...");
	}
}