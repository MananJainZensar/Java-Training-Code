package assignment01;
import java.util.Scanner;

public class Account {
    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(0);

        while (true) {
            System.out.println("Choose an option: deposit, withdraw, print, exit");
            String option = scanner.next();

            switch (option) {
                case "deposit":
                    System.out.println("Enter amount to deposit:");
                    float depositAmount = scanner.nextFloat();
                    account.deposit(depositAmount);
                    break;
                case "withdraw":
                    System.out.println("Enter amount to withdraw:");
                    float withdrawAmount = scanner.nextFloat();
                    account.withdraw(withdrawAmount);
                    break;
                case "print":
                    account.printBalance();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}