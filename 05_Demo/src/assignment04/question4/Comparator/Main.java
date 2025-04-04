package assignment04.question4.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		ArrayList<Person>persons = new ArrayList<Person>() {{
			add(new Person(179, "Manan Jain", 89.2));
			add(new Person(175, "Ashish Jain", 86.2));
			add(new Person(174, "Himani Jain", 83.2));
			add(new Person(176, "Shikha Jain", 69.2));
			add(new Person(173, "Ajinkya Jain", 39.2));
			add(new Person(1767, "Sanika Jain", 69.2));
		}};
		System.out.println("Original List");
		for(Person person : persons) {
			System.out.println(person);
		}
		System.out.println();
		
		Collections.sort(persons, new SortByHeight());
		System.out.println("After Sorting By height");
		for(Person person : persons) {
			System.out.println(person);
		}
		
		Collections.sort(persons, new SortByWeight());
		System.out.println("After sorting by Weight");
		for(Person person : persons) {
			System.out.println(person);
		}
		Collections.sort(persons, new SortByName());
		System.out.println("After Sorting By Name");
		for(Person person : persons) {
			System.out.println(person);
		}
	}
}
