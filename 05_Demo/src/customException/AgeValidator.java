package customException;

public class AgeValidator {
	public static void validateAge(int age) throws Exception{
		if(age<0) {
			throw new WrongAgeException("Age must be greater than 0 : "+age);
		}
		else if(age>=18) {
			System.out.println("Elgible for voting...");
		}
		else {
				throw new InvalidAgeException("Invalid Age : "+age);	
		}
	}
}
 