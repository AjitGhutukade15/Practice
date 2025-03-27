package package1;
/*Defines a Car class with brand and year attributes.
Has a constructor to initialize these attributes.
Creates an object of Car in main() and prints its details.

*/

class Car {
	public String brand;
	public int year;

	Car() {
		this.brand = "Audi";
		this.year = 2025;
	}
}

public class Classes1 {
	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("Car Brand: " + car1.brand);
		System.out.println("Manufacturing Year: " + car1.year);

	}

}


