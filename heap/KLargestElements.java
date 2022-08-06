package heap;

import java.util.PriorityQueue;

public class KLargestElements {

	static void printKlargestElements(int[] arr,int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap when working with largest
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
			
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,3,10,15,20,2};
		
		printKlargestElements(arr,3);
	}
}
