package package1;

import java.util.Scanner;

/*
 * Write a Java program that:

Takes two integers as input from the user.
Divides the first number by the second.
Handles the ArithmeticException if the second number is zero and prints "Cannot divide by zero".
Otherwise, prints the result.

*/
public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try {
			int result = num1 / num2; // Perform integer division
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}

		sc.close();
	}

}
