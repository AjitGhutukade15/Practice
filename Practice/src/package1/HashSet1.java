package package1;

import java.util.HashSet;
import java.util.Scanner;

/*Creates a HashSet to store unique city names.
Adds five city names, including one duplicate.
Prints all cities.
*/
public class HashSet1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashSet<String> citys=new HashSet<String>();
		
		System.out.println("Enter five Cities :");
		for (int i = 0; i < 5; i++) {
			citys.add(sc.nextLine());
		}
		 
		for(String c1:citys)
		{
			System.out.print(" "+c1);
		}
		sc.close();
	}

}
