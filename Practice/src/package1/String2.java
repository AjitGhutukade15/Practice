package package1;

import java.util.Scanner;

/*
Write a Java program that:

Takes two string inputs from the user.
Concatenates both strings and prints the result.
Checks if the first string contains the second string and prints true or false.

Enter first string: Hello  
Enter second string: World  
Concatenated: HelloWorld  
Contains check: false  
*/
public class String2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();

		String concat = str1 + str2;
		System.out.println("Concatenated: " + concat);

		if (str1.contains(str2)) {
			System.out.println("Contains check: " + true);
		} else
			System.out.println("Contains check: " + false);
		sc.close();
	}

}
