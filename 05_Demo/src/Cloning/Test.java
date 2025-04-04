package Cloning;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course c1=new Course(101, "Java", 3);
		Course c2=(Course) c1.clone();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		Student s1=new Student(505, "Venkat", 59.69, c1);
		Student s2=(Student)s1.clone(); // shallow cloning
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s2);
		
		c1.setName("Core Java");
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		s2.getCourse().setName("Assembly");
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		
		System.out.println(s1.getCourse().hashCode());
		System.out.println(s2.getCourse().hashCode());
		
		System.out.println(c1.getName());
		System.out.println(c1.getName());
	}
}
