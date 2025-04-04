package assignment02;

public class Bank {
	public static void main(String[] args) {
        savingsAccount savings1 = new savingsAccount(1000, 5000);
        currentAccount current1 = new currentAccount(2000, 3000);

        savingsAccount savings2 = new savingsAccount(1500, 2500);
        currentAccount current2 = new currentAccount(3000, 2000);

        AccountHolder holder1 = new AccountHolder(101,"John Doe", savings1, current1);
        AccountHolder holder2 = new AccountHolder(102,"Jane Smith", savings2, current2);
        
        System.out.println(holder1.getTotalBalance());
        System.out.println(holder2.getTotalBalance());
        int totalCashInBank = holder1.getTotalBalance() + holder2.getTotalBalance();
        System.out.println("Total cash in the bank: " + totalCashInBank);
    }
}
