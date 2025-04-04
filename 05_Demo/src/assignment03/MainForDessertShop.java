package assignment03;

import java.util.Scanner;

public class MainForDessertShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your role (owner/customer): ");
        String role = scanner.nextLine();

        Inventory inventory = new Inventory();
        User user = new User(role, inventory);
        user.performOperations();

        scanner.close();
    }
}