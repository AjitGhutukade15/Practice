package package1;

class MyThreadClass extends Thread {
	public void run() {
		System.out.println("Hello from thread!");
	}

}

public class Multi_threading {
	public static void main(String[] args) throws InterruptedException {

		MyThreadClass m1 = new MyThreadClass();
		m1.start();
		;
	}

}
