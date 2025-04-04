package Enum;

public class Main {
	public static void main(String[] args) {
		Ticket t1 = new Ticket(5050555,"Venkat","Kolkata","Pune",Status.CONFIRMED);
		Ticket t2 = new Ticket(5050556,"Venkat","Kolkata","Pune",Status.RAC);
		System.out.println(t1);
		System.out.println(t2);
	}
}
