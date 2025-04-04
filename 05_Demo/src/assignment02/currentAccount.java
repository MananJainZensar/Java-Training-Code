package assignment02;

public class currentAccount extends Account {
	private int cashCredits;
	
	public currentAccount(int balance, int cashCredits) {
		super(balance);
		this.cashCredits = cashCredits;
	}
	@Override
	public int getTotalCash() {
		return balance + cashCredits; 
	}
	@Override
	public String toString() {
		return "currentAccount [cashCredits=" + cashCredits + "]";
	}
	
}
