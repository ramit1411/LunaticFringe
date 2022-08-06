package stackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = { 6, 2, 5, 4, 5, 1, 6 };
		areaHistogram(widthArr(NSL(price),NSR(price)),price);
		
	}
	
	static int[] NSR(int[] arr) {
		int[] NSR = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = arr.length-1;i>=0;i--) {
			while(!stack.empty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			
			NSR[i] = stack.empty() ? arr.length : (stack.peek());
			stack.push(i);
		}
		
		System.out.println("NSR ---> "+ Arrays.toString(NSR));
		
		return NSR;		
	}
	
	
	
	static int[] NSL(int[] arr) {
		
		int[] NSL = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0;i<arr.length;i++) {
			while(!stack.empty() && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			
			NSL[i] = stack.empty() ? -1 : (stack.peek());
			stack.push(i);
		}
		
		System.out.println("NSL ---> "+ Arrays.toString(NSL));
		
		return NSL;
	}
	
	
	static int[] widthArr(int[] NSL,int[] NSR) {
		
		int[] widthArray = new int[NSL.length];
		
		for(int i = 0;i<NSL.length;i++) {
			widthArray[i] = (NSR[i] - NSL[i]) - 1;
		}
		
		System.out.println("widthArray ---> "+ Arrays.toString(widthArray));
		
		return widthArray;
	}
	
	
	static void areaHistogram(int[] widthArray,int[] array) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<array.length;i++) {
			if(max < (array[i]*widthArray[i])) {
				max = array[i]*widthArray[i];
			}
		}
		
		System.out.println(max);
		
	}
	
	

}
