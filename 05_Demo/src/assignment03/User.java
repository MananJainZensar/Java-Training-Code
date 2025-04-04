package assignment03;

import java.util.Scanner;

public class User {
    private String role;
    private Inventory inventory;

    public User(String role, Inventory inventory) {
        this.role = role;
        this.inventory = inventory;
    }

    public void performOperations() {
        Scanner scanner = new Scanner(System.in);
        if (role.equalsIgnoreCase("owner")) {
            while (true) {
                System.out.println("Enter the following operation: 1) See the storage 2) Add items in the inventory 3) Exit");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        System.out.println("Current Inventory: " + inventory.getInventory());
                        break;
                    case 2:
                        System.out.println("Enter the item to add: ");
                        String item = scanner.nextLine();
                        inventory.addItem(item);
                        System.out.println("Item added to inventory.");
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else if (role.equalsIgnoreCase("customer")){
            while(true) {
            	System.out.println("Enter the following options 1)See menu 2)Buy items 3)Exit: ");
            	int options = scanner.nextInt();
            	scanner.nextInt();
            	
            	switch(options) {
            	case 1:
            		System.out.println("The menu is: " + inventory.getInventory() );
            		break;
            	case 2:
            		System.out.println("What would you like to buy: ");
            		String item = scanner.nextLine();
            		inventory.removeItem(item);
            		System.out.println("Item bought! ");
            	case 3:
            		System.out.println("Exiting...");
            		return;
            	default:
            		System.out.println("Invalid Option");
            	}
            }
        }else {
        	System.out.println("Invalid Role. ");
        }
        scanner.close();
    }
}