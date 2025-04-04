package HasA;

public class Author {
	private int id;
	private String name;
	private String Address;
	
	public Author(int id, String name, String Address) {
		this.id = id;
		this.name = name;
		this.Address = Address;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + Address;
	}
}
