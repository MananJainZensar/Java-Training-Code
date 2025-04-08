package Maps;


public class Customer {
	private int cId;
	private String customerName;
	
	public Customer(int cId, String customerName) {
		this.cId = cId;
		this.customerName = customerName;
	}
	

	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", customerName=" + customerName + "]";
	}
	
}
