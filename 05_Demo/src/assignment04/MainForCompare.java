package assignment04;

public class MainForCompare {
	public static void main(String[] args) {
		Manager manager1 = new Manager(3, "Alice",75000);
		Manager manager2 = new Manager(1, "Bob", 80000);
        Manager manager3 = new Manager(2, "Charlie", 70000);
        
        manager1.Managers.add(manager1);
        manager1.Managers.add(manager2);
        manager1.Managers.add(manager3);
        
        manager2.sortAll();
        
        for (Manager manager : manager1.Managers) {
            System.out.println("ID: " + manager.getManagerId() + ", Name: " + manager.getManagerName() + ", Salary: " + manager.getSalary());
        }
        
	}
}
