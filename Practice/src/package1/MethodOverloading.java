package package1;
/*
 *  Write a Java program that:

Defines a Calculator class with an overloaded method add():
One version takes two integers and returns their sum.
Another version takes three integers and returns their sum.
In main(), create an object of Calculator and call both versions of add().*/

class Calculator {
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("Sum of 2 numbers:" + calculator.add(1, 20));
		System.out.println("Sum of 3 numbers:" + calculator.add(1, 2, 3));

	}

}
