package assignment01;

public class Question7 {
	private static int accountIdCounter = 100001;
	private static int totalAccounts = 0;

	private int accId;
	private String userName;
	private double balance;
	private double rate;
	
	public Question7(String userName, double balance, double rate) {
		this.accId = accountIdCounter++;
		this.userName = userName;
		this.balance = balance;
		this.rate = rate;
		totalAccounts++;
	}
	public static void  printTotalAccounts() {
		System.out.println("Total accounts are: "+ totalAccounts);
	}
	public int getAccId() {
		return accId;
	}
	
	
}
