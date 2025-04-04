package assignment02;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Manan Jain", 700, 13, 23);
		e1.printSalary();
//		System.out.println(e1.printSalary());
		System.out.println(e1);
		Manager m1 = new Manager(101, "Manan Jain", 700, 13, 23,10000);
		m1.printSalary();
		System.out.println(m1);
		Labour l1 = new Labour(102, "Manan Jain", 700, 13, 23, 4, 200);
		l1.printSalary();
		System.out.println(l1);
	}
}
