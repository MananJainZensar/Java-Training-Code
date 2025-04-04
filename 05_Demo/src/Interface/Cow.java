package Interface;

public class Cow implements Animal {
	private String name;
	public Cow(String name) {
		this.name = name;
	}
	@Override
	public void eat() {
		System.out.println("Cow is eating");
	}
	public void walk() {
		System.out.println("Cow is Walking");
	}
}
