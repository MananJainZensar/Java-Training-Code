package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> errors = new HashMap<>();
		errors.put(404, "Not avaiable");
		errors.put(200, "OK");
		errors.put(500, "Server error");
		errors.put(401, "Unauthorized");
		errors.put(201, "OK");
 
		Set<Entry<Integer, String>> errSet = errors.entrySet();
 
		for (Entry<Integer, String> r : errSet) {
			System.out.println(r);
		}
 
		System.out.println("======================\nAll keys");
		Set<Integer> allKeys = errors.keySet();
		for (Integer k : allKeys) {
			System.out.println(k);
		}
 
		Collection<String> allValue = errors.values();
		System.out.println(allValue);
 
		for (Entry<Integer, String> err : errSet) {
			int key = err.getKey();
			String value = err.getValue();
			if (key == 500) {
				err.setValue("Internal server Error");
				System.out.println(key + " ===========> " + value);
			}
		}
		System.out.println("==========\nUpdated data\n");
		errSet = errors.entrySet();
 
		for (Entry<Integer, String> r : errSet) {
			System.out.println(r);
		}
	}
}

