package assignment02;

public class savingsAccount extends Account{
	private int fixedDeposits;
	
	public savingsAccount(int balance,int fixedDeposits) {
		super(balance);
		this.fixedDeposits = fixedDeposits;
	}
	@Override
	public int getTotalCash() {
		return balance + fixedDeposits;
	}
	@Override
	public String toString() {
		return "savingsAccount [fixedDeposits=" + fixedDeposits + "]";
	}
	
}
