package heap;

import java.util.PriorityQueue;

public class SortKSortedArray {

	
	static void kSort(int[] arr,int k) {
		
		PriorityQueue<Integer> pq  = new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
			
			if(pq.size() > k) {
				break;
			}
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,5,3,2,8,10,9};
		kSort(arr,3);
		
	}

}
