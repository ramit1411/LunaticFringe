package stackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaRectangeInBinaryMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{0,1,1,0},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,0,0}
		};
		
		processArr(arr);
	}
	
	static void processArr(int[][] arr) {
		
		int max = Integer.MIN_VALUE;
		int[] newArr = new int[arr.length];
		
		for(int i = 0;i<arr.length ; i++) {
			newArr[i] = 0;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j] == 0) {
					newArr[j] = 0;
				} else {
					newArr[j] += arr[i][j];
				}
				
			}
			max =  maxAreaHistogram(widthArr(NSL(newArr),NSR(newArr)),newArr);
//			System.out.print(max);
			
			max = Math.max(max,maxAreaHistogram(widthArr(NSL(newArr),NSR(newArr)),newArr));
		}
		
		System.out.print(max);
		
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
		
//		System.out.println("NSR ---> "+ Arrays.toString(NSR));
		
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
		
//		System.out.println("NSL ---> "+ Arrays.toString(NSL));
		
		return NSL;
	}
	
	
	static int[] widthArr(int[] NSL,int[] NSR) {
		
		int[] widthArray = new int[NSL.length];
		
		for(int i = 0;i<NSL.length;i++) {
			widthArray[i] = (NSR[i] - NSL[i]) - 1;
		}
		
//		System.out.println("widthArray ---> "+ Arrays.toString(widthArray));
		
		return widthArray;
	}
	
	
	static int maxAreaHistogram(int[] widthArray,int[] array) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<array.length;i++) {
			if(max < (array[i]*widthArray[i])) {
				max = array[i]*widthArray[i];
			}
		}
		
		return max;
		
	}

}
