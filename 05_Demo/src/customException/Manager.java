package customException;
import java.io.IOException;

public class Manager extends Employee {
	@Override
	public void validateName(String name) throws IOException {
		if(name.length()>0) {
			System.out.println("Valid Name: ");
		}
		else {
			throw new IOException("Wrong Name: " + name);
		}
	}
}
