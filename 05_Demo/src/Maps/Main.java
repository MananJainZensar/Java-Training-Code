package Maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map <Customer, List<Product>> catlog = new HashMap<>();
		catlog.put(new Customer(101, "Manan Jain"), new ArrayList<Product>() {{
			add(new Product(501,"Keyboard",700));
			add(new Product(502,"Keyboar",800));
			add(new Product(503,"Keyboa",900));
			add(new Product(504,"Keybo",1000));
			add(new Product(505,"Keyb",300));
			add(new Product(506,"Key",400));
			add(new Product(507,"Ke",100));
			add(new Product(508,"K",2300));
			add(new Product(509,"Keyboardd",1700));
		}});
//		System.out.println(catlog);
		catlog.put(new Customer(102, "Tehefiz Ahmed"), new ArrayList<Product>() {{
			add(new Product(501,"Keyboard",700));
			add(new Product(502,"Keyboar",800));
			add(new Product(503,"Keyboa",900));
			add(new Product(504,"Keybo",1000));
			add(new Product(505,"Keyb",300));
			add(new Product(506,"Key",400));
			add(new Product(507,"Ke",100));
			add(new Product(508,"K",2300));
			add(new Product(509,"Keyboardd",1700));
		}});

		// Set<Entry<Customer, List<Product>>> data = catlog.entrySet();
		// for (Entry<Customer, List<Product>> entry : data) {
		// 	System.out.println(entry);
		// }
		Comparator<Customer>CustomerComparator = new Comparator<Customer>(){ //
			@Override
			public int compare(Customer o1, Customer o2){
				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}// This comparator compares two objects of customer class by their name.
		};
		Comparator <Product> ProductComparator =(p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());//This comparator method compares the price of two products using lambda method "() ->"
		TreeMap <Customer,List<Product>> sortedCat = new TreeMap<>(CustomerComparator); //Becuase we had to perform sorting we have created a treemap of customer class and product class in toder to perfom sorting.
		Set<Entry<Customer,List<Product>>> set = catlog.entrySet(); 
		for(Entry<Customer,List<Product>> entry:set){
			List<Product> prods = entry.getValue();
			prods.sort(ProductComparator);
			sortedCat.put(entry.getKey(),prods);
		}
		System.out.println(sortedCat);
	}
}
