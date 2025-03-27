package package1;

import java.util.Scanner;

/*
 * Define an abstract class Shape with an abstract method calculateArea().
Create two subclasses: Circle and Rectangle, which implement calculateArea().
Circle should take a radius and return π * r².
Rectangle should take length and width and return length * width.
In main(), create objects of both classes, calculate their areas, and print them.*/

abstract class Area {
	abstract double calculateArea();
}

class Circle extends Area {
	private double radious;

	Circle(int radious) {
		this.radious = radious;
	}

	@Override
	double calculateArea() {

		return Math.PI * radious * radious;
	}
}

class Rectangle extends Area {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {

		return length * width;
	}
}

public class AbstractClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius :");
		int rd = sc.nextInt();
		Circle circle = new Circle(rd);
		System.out.println("Area of circle = " + circle.calculateArea());

		System.out.println("Enter the length and width :");
		int length = sc.nextInt();
		int width = sc.nextInt();
		Rectangle rectangle = new Rectangle(length, width);
		System.out.println("Area of Rectangle = " + rectangle.calculateArea());

		sc.close();
	}
}
