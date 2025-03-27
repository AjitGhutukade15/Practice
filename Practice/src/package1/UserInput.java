package package1;

import java.util.Scanner;

//Write a Java program that asks the user to enter their name and then prints:
//Hello, [name]!
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello, "+sc.next());
		sc.close();
	}

}
