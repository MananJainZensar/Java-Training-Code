package assignment04.question4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>() {{
			add(new Person(171, "Manan Jain", 849.5));
			add(new Person(172, "Manan Jai", 84.6));
			add(new Person(173, "Manan Ja", 84.7));
			add(new Person(174, "Manan J", 84.8));
			add(new Person(175, "Manan", 84.9));
		}};
		Collections.sort(persons);
		for(Person person: persons) {
			System.out.println("Name: " + person.getName() + ", Height: " + person.getHeight_in_inches() + ", Width: " + person.getWidth_in_inches());
		}
	}
}
