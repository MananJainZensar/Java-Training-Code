package customException;
import java.io.IOException;

public class Employee {
	private String name;
	private double salary;
	
	public void validateName(String name) throws IOException{
		if(name.length()>=2) {
			System.out.println("Validate Name");
		}
		else {
			throw new IOException("Invalid name: " + name);
		}
	}
}
