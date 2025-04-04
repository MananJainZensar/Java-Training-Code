package Interface;

public class Tiger implements Animal {
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	@Override
	public void walk() {
		System.out.println("Tiger Walks");
	}
	@Override
	public void eat() {
		System.out.println("Tiger eats");
	}
}
