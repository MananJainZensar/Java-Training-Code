package assignment02;

abstract class Account {
	protected int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	public abstract int getTotalCash();
}
