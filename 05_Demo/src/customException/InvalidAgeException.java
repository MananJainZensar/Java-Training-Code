package customException;

public class InvalidAgeException extends RuntimeException{
	private String msg;
	public InvalidAgeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
}
// User defined checked exception.
class WrongAgeException extends Exception{
	private String msg;
	public WrongAgeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}	
}