package Interface;

public class InterfaceTest {
	public static void main(String[] args) {
		Tiger a = new Tiger();
		a.walk();
		a.eat();
		
		Animal b = new Tiger();
		b.eat();
		b.walk();

	}
	
}
