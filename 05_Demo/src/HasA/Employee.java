package HasA;

public class Employee {
	private int Id;
	private String name;
	private int Salary;
	private Address address;
	
	public Employee(int Id, String name, int Salary,Address address) {
		super();
		this.Id = Id;
		this.name = name;
		this.Salary = Salary;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return Id + " " + name + " " + Salary + " " + address;
	}
}
