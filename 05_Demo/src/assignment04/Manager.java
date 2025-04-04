package assignment04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager implements Sortable {
    private int managerId;
    private String managerName;
    private double salary;
    ArrayList<Manager> Managers = new ArrayList<Manager>();

    public Manager(int managerId, String managerName, double salary) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.salary = salary;
    }
    @Override
    public void sortAll() {
    	int n = Managers.size();
    	for(int i = 0 ; i < n - 1; i++) {
    		for (int j = 0;j < n - i - 1; j++) {
    			if(Managers.get(j).managerId > Managers.get(j+1).managerId) {
    				Manager temp = Managers.get(j);
    				Managers.set(j,Managers.get(j+1));
    				Managers.set(j + 1,temp);
    			}
    		}
    	}
    	
    }
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}