package package1;

import java.util.LinkedList;

/*Creates a LinkedList of integers.
Adds five numbers.
Removes the first element.
Prints the updated list.*/
public class LinkedList1 {
	public static void main(String[] args) {
		
		LinkedList<Integer> num=new LinkedList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("Before removal : "+num);
		
		num.removeFirst();
		
		System.out.println("After removal : "+num);
	}

}
