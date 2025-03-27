package package1;

/*
Write a Java program that:

Defines a Person class with attributes name and age.
Creates a parameterized constructor to initialize these attributes.
In main(), create two Person objects with different values and print their details.
Example Output:

*/
class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
}

public class Classes2 {
	public static void main(String[] args) {

		Person person1 = new Person("Ajit", 25);
		System.out.println("Name: " + person1.name + " Age: " + person1.age);

		Person person2 = new Person("Rahul", 30);
		System.out.println("Name: " + person2.name + " Age: " + person2.age);
	}

}
