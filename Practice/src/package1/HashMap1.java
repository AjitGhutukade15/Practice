package package1;

import java.util.HashMap;

import java.util.Map;

/*Creates a HashMap to store student names as keys and their marks as values.
Adds three students and their marks.
Prints each student's name with their marks.*/

public class HashMap1 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Alice", 25);
		map.put("Bob", 30);
		map.put("Charlie", 35);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.print("Name "+ entry.getKey()+"  ");
			 System.out.print( "Marks "+entry.getValue());
			 System.out.println();
			
		}
		
	}

}
