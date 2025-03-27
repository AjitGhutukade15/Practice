package package1;

/*
 * Write a Java program that:

Defines a Bank class with a method getInterestRate() that returns 0.0.
Creates two subclasses: SBI and HDFC, which override getInterestRate() to return 5.5% and 6.7%, respectively.
In main(), create objects of SBI and HDFC, call getInterestRate(), and print the interest rates.

*/
class Bank {
	double getInterestRate() {
		return 0.0;
	}
}

class SBI extends Bank {

	@Override
	double getInterestRate() {
		return 5.5;

	}
}

class HDFC extends Bank {

	@Override
	double getInterestRate() {
		return 6.7;

	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");

		HDFC hdfc = new HDFC();
		System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
	}
}
