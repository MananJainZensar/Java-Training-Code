package HasA;

public class Main {
	public static void main(String[] args) {
//		Address a1 = new Address(1,"Western High Street","Pune",411057,"Maharashtra");
//		Employee e1 = new Employee(101,"Manan",400000,a1);
//		System.out.println(e1);
		Author a1 = new Author(1,"Manan Jain","Pune");
		Book b1 = new Book(101,"The Subtle art of not giving a Fu*k",500,a1);
		System.out.println(b1);
	}
}
