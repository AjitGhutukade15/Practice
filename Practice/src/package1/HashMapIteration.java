package package1;

import java.util.HashMap;
import java.util.Map.Entry;

/*Creates a HashMap with 3 country names as keys and their capitals as values.
Iterates over the map and prints each country with its capital.*/
public class HashMapIteration {
	
	public static void main(String[] args) {
		
		HashMap<String, String> country=new HashMap<String, String>();
		
		country.put("India", "Delhi");
		country.put("France", "Paris");
		country.put("Germany", "Berlin");
		
		for (Entry<String, String> entry : country.entrySet()) {
			System.out.print("Country : "+entry.getKey()+" ");
			System.out.print("Capital : "+entry.getValue());
			
			System.out.println();
			
		}
	}
}
