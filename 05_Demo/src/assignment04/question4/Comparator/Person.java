package assignment04.question4.Comparator;
import java.util.Comparator;
public class Person {
	private Integer height_in_inches;
	private String name;
	private Double width_in_inches;
	
	public Person(Integer height_in_inches, String name, Double width_in_inches) {
		this.height_in_inches = height_in_inches;
		this.name = name;
		this.width_in_inches = width_in_inches;
	}

	public Integer getHeight_in_inches() {
		return height_in_inches;
	}

	public String getName() {
		return name;
	}

	public Double getWidth_in_inches() {
		return width_in_inches;
	}

	@Override
	public String toString() {
		return "Person [height_in_inches=" + height_in_inches + ", name=" + name + ", width_in_inches="
				+ width_in_inches + "]";
	}
	
}

//class SortByHeight implements Comparator<Person>{
//	public int compare(Person a, Person b) {
//		int NameCompare = a.getName().compareTo(b.getName());
//		int heighCompare = a.getHeight_in_inches().compareTo(b.getHeight_in_inches());
//		int widthCompare = a.getWidth_in_inches().compareTo(b.getWidth_in_inches());
//		if (NameCompare != 0) {
//			return NameCompare;
//		}else if(heighCompare != 0) {
//			return heighCompare;
//		}else{
//			return widthCompare;
//		}
//	}
//}

class SortByHeight implements Comparator<Person>{
	public int compare(Person a, Person b) {
		return a.getHeight_in_inches() - b.getHeight_in_inches();
	}
}

class SortByWeight implements Comparator<Person>{
	public int compare(Person a , Person b) {
		int result = a.getWidth_in_inches().compareTo(b.getWidth_in_inches());
		return result;
	}
}


class SortByName implements Comparator<Person>{
	public int compare(Person a , Person b) {
		int resultName = a.getName().compareTo(b.getName());
		return resultName;
	}
}