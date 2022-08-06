package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestNumbers {

	
	static void kClosestNumbers(int[] arr,int k,int x) {
		int n = arr.length;
	    // Make a max heap.
	    PriorityQueue<Pair> pq = new PriorityQueue<>(
	                             new Comparator<Pair>()
	    {
	        public int compare(Pair p1, Pair p2)
	        {
	            return p2.getValue().compareTo(
	                   p1.getValue());
	        }
	    });
	     
	    // Build heap of difference with
	    // first k elements
	    for(int i = 0; i < n; i++)
	    {
	        pq.offer(new Pair(arr[i],
	                 Math.abs(arr[i] - x)));
	        
	        if(pq.size() > k) {
	        	pq.poll();
	        }
	    }
	     
//	    // Now process remaining elements.
//	    for(int i = k; i < n; i++)
//	    {
//	        int diff = Math.abs(arr[i] - x);
//	         
//	        // If difference with current
//	        // element is more than root,
//	        // then ignore it.
//	        if(diff > pq.peek().getValue()) continue;
//	         
//	        // Else remove root and insert
//	        pq.poll();
//	        pq.offer(new Pair(arr[i], diff));
//	    }
	     
	    // Print contents of heap.
	    while(!pq.isEmpty())
	    {
	        System.out.print(pq.poll().getKey() + " ");
	    }
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,8,9};
		kClosestNumbers(arr,3,7);
	}

}
