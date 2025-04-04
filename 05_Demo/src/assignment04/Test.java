package assignment04;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		DateOfBirth d1 = new DateOfBirth(12, 9, 2003);
		EmployeeForClone e1 = new EmployeeForClone(101, "Manan Jain", 50000, d1);
		DateOfBirth d2 = (DateOfBirth) d1.clone();
		EmployeeForClone e2 = (EmployeeForClone) e1.clone();
		System.out.println("Shallow Copy: " + e2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}
}
