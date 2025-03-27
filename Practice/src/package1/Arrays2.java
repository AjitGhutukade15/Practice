package package1;

import java.util.Scanner;

/*
Takes n numbers as input from the user and stores them in an array.
Prints all elements of the array.
Calculates and prints the sum of all elements.

*/
public class Arrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int len = sc.nextInt();
		System.out.println("Enter the array of length " + len);
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array elements: ");
		long sum = 0;
		// printing the array & adding in same loop
		for (int num : arr) {
			System.out.print(num + " ");
			sum = sum + num;
		}
		System.out.println();
		System.out.println("Sum of elements: " + sum);
		sc.close();

	}

}
