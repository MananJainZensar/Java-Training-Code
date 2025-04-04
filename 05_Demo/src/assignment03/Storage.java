package assignment03;

import java.util.ArrayList;

public abstract class Storage {
    protected ArrayList<String> inventory = new ArrayList<>();

    public abstract void addItem(String item);
    public abstract ArrayList<String> getInventory();
    public abstract void removeItem(String item);
}