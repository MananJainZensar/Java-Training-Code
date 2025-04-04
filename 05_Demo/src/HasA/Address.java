package HasA;

public class Address {
	private int id;
	private String street;
	private String city;
	private int pinCode;
	private String state;
	
	public Address(int id, String street, String city, int pinCode, String state) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String toString() {
		return id + " " + street + " " + city + " " + pinCode + " " + state;
	}
}

