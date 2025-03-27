package package1;
/*	Write a Java program that defines an interface Animal with a method makeSound().
 *  Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark!". 
 *  In main(), create an object of Dog and call makeSound().
*/

interface Animal1{
	abstract void makeSound();
}

class Dog1 implements Animal1
{

	@Override
	public void makeSound() {
		System.out.println("Bark!");	
	}
}
public class Interfaces {

	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.makeSound();
		
	}
}