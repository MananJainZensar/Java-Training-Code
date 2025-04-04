package assignment02;

public class AccountHolder {
	private int accountId;
	private String accountName;
	private savingsAccount savingsAccount;
	private currentAccount currentAccount;
	
	public AccountHolder(int accountId, String accountName, savingsAccount savingsAccount, currentAccount currentAccount) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.savingsAccount = savingsAccount;
		this.currentAccount = currentAccount;
	}
	public int getTotalBalance() {
        int totalSavings = (savingsAccount != null) ? savingsAccount.getTotalCash() : 0;
        int totalCurrent = (currentAccount != null) ? currentAccount.getTotalCash() : 0;
        return totalSavings + totalCurrent;
    }
	
	}
