package package1;
/*
 Write a Java program that:

Defines a Animal class with a method makeSound() that prints "Some generic animal sound".
Creates a Dog class that inherits from Animal and overrides makeSound() to print "Bark!".
In main(), create an object of Dog and call makeSound().

 * */

class Animal {
	public void makeSound() {
		System.out.println("Some generic animal sound ");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Bark!");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}

}
