package package1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Creates an ArrayList of Strings.
Adds three names to the list.
Prints all the names using a loop.
*/
public class ArrayList1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<String>();
		System.out.println("Enter three names");
		
		for (int i = 0; i < 3; i++) {
			arr.add(sc.nextLine());
		}
		
		for(String str1:arr)
		{
			System.out.print(str1+" ");
		}
		sc.close();
	}

}
