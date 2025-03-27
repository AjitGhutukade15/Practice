package package1;

import java.util.*;

/*
 * Creates a Queue of integers using LinkedList.
Adds five numbers.
Removes the front element.
Prints the remaining queue.
*/
public class Queue1 {
	public static void main(String[] args) {
		
		Queue<Integer> num=new LinkedList<Integer>();
		
		num.add(5);
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		
		System.out.println("Before Removal : "+num);
		
		num.remove();
		
		System.out.println("After Removal : "+num);
	}

}
