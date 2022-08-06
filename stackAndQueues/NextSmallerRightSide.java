package stackAndQueues;

import java.util.Stack;

public class NextSmallerRightSide {

public static void NSRS(int[] arr) {
		
		int[] nge = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int iterator = arr.length-1 ; iterator >= 0 ; iterator--) {
			
			if(!stack.isEmpty()) {
				
				while(!stack.empty() && stack.peek() >= arr[iterator]) {
					stack.pop();
				}
			}
			
			nge[iterator] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(arr[iterator]);
		}
		
		
		for(int iterator = 0 ; iterator <arr.length; iterator++) {
			System.out.println(arr[iterator] + " ---> " + nge[iterator]);
		}
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 4 };
		NSRS(arr);
	}
}
