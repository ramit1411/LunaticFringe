package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //Min Heap
		
		pq.add(15);
		pq.add(5);
		pq.add(10);
		
		System.out.println(pq.size());
		
		while(!pq.isEmpty()) {
			
			System.out.println(pq.peek());
			pq.poll();
		}
		System.out.println();
		
		

		pq = new PriorityQueue<>(Collections.reverseOrder()); //Max Heap
		
		pq.add(15);
		pq.add(5);
		pq.add(10);
		
		System.out.println(pq.size());
		
		while(!pq.isEmpty()) {
			
			System.out.println(pq.peek());
			pq.poll();
		}

		
		
	}
}
