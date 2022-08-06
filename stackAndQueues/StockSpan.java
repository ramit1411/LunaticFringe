package stackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	
	static void stockSpan(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int[] sS = new int[arr.length];
		stack.push(0);
		sS[0] = 1;
		
		for(int i=1;i<arr.length;i++) {
			
			while(!stack.empty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			
			sS[i] = (stack.isEmpty()) ? (i+1) : (i-stack.peek());
			stack.push(i);
		}
		
		System.out.print(Arrays.toString(sS));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = { 10, 80, 60, 70, 60, 75, 85 };
		stockSpan(price);
		
	}

}
