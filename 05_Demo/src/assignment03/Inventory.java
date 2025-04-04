package assignment03;
import java.util.ArrayList;
public class Inventory extends Storage {

    @Override
    public void addItem(String item) {
        inventory.add(item);
    }

    @Override
    public ArrayList<String> getInventory() {
        return inventory;
    }
    @Override
    public void removeItem(String item) {
    	if(inventory.contains(item)) {
    		inventory.remove(item);
    	}else {
    		System.out.println("Item not availabe in the inventory");
    	}
    }
}