package assignment04.question4;
//import java.util.ArrayList;
public class Person implements Comparable<Person> {
	private Integer height_in_inches;
	private String name;
	private Double width_in_inches;
	
	public Person(Integer height_in_inches, String name, Double width_in_inches) {
		this.height_in_inches = height_in_inches;
		this.name = name;
		this.width_in_inches = width_in_inches;
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		 
		return Double.compare(this.width_in_inches, o.width_in_inches);
	}

	public Integer getHeight_in_inches() {
		return height_in_inches;
	}

	public void setHeight_in_inches(Integer height_in_inches) {
		this.height_in_inches = height_in_inches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWidth_in_inches() {
		return width_in_inches;
	}

	public void setWidth_in_inches(Double width_in_inches) {
		this.width_in_inches = width_in_inches;
	}
	
	
}
