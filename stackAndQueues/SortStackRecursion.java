package stackAndQueues;

import java.util.ListIterator;
import java.util.Stack;

public class SortStackRecursion {

	
	
	static void reverse(Stack<Integer> stack) {
		if(stack.size() > 0) {
			int value = stack.pop();
			reverse(stack);
			insertCorrectPosition(value,stack);
		}
	}
	
	static void insertCorrectPosition(int value,Stack<Integer> stack) {
		
		if(stack.isEmpty() || stack.peek() < value) {
			stack.push(value);
		} else {
			int newVal = stack.pop();
			insertCorrectPosition(value,stack);
			stack.push(newVal);
		}
		
	}
	
    // Utility Method to print contents of stack
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
 
        // forwarding
        while (lt.hasNext())
            lt.next();
 
        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }
	
	   // Driver code
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
 
        System.out.println(
            "Stack elements before sorting: ");
        printStack(s);
 
        reverse(s);
 
        System.out.println(
            " \n\nStack elements after sorting:");
        printStack(s);
    }

}
