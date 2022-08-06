package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

	
	static int returnKthSmallestElement(int[] arr,int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //max heap implemented like this
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		return pq.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,3,10,15,20,2};
		
		System.out.print(returnKthSmallestElement(arr,3));
	}

}
