package package1;

import java.util.Scanner;

/*write a Java program that:

Takes a string input from the user.
Prints the length of the string.
Converts the string to uppercase and prints it.

Enter a string: hello world  
Length of string: 11  
Uppercase: HELLO WORLD  
*/
public class String1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string ");
		String str1 = sc.nextLine();
		System.out.println("Length of string: " + str1.length());
		str1=str1.toUpperCase();
		System.out.println("Uppercase: " + str1);
		sc.close();
	}

}
