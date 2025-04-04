package Enum;

public class Ticket {
	private long pnr;
	private String name, sourceStation, destination;
	private Status status;
	
	public Ticket(long pnr,String name, String socurceStation,String destination, Status status) {
		this.pnr = pnr;
		this.name = name;
		this.sourceStation = socurceStation;
		this.destination = destination;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", name=" + name + ", sourceStation=" + sourceStation + ", destination="
				+ destination + ", status=" + status + "]";
	}
	
	
}

