package slidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxOfSubArrays {

	
	private static ArrayList<Integer> getMaxOfSubArrays(int[] arr,int windowSize) {

		ArrayList<Integer> answerList = new ArrayList<Integer>();
		int start=0,end=0;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		while(end<arr.length) {
			
			maxHeap.add(arr[end]);

			if((end-start+1) < windowSize) {
				end++;
			} else if((end-start+1) == windowSize) {
				answerList.add(maxHeap.peek());
				maxHeap.remove(arr[start]);
				start++;
				end++;
			}
		}

		return answerList;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,-1,-3,5,3,6,7};
		
		
		System.out.println("The SubArray -> "+getMaxOfSubArrays(arr,3));
		
	}

}
