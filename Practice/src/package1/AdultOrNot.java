package package1;

import java.util.Scanner;

/*Write a Java program that asks the user to enter their age.
If age is 18 or more, print "You are an adult."
Otherwise, print "You are not an adult."*/
public class AdultOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Age :");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are an adult.");
		} else
			System.out.println("You are not an adult.");
		sc.close();
	}
	
}
