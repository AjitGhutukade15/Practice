package package1;

import java.util.Stack;

/*Creates a Stack of strings.
Pushes three names.
Pops one element.
Prints the remaining stack.*/

public class Stack1 {
	public static void main(String[] args) {
		
		Stack<String> string=new Stack<String>();
		
		string.push("AJit");
		string.push("Sachin");
		string.push("Vishal");
		
		System.out.println("Before Pop :"+string);
		
		string.pop();
		
		System.out.println("After Pop :"+string);
	}

}
