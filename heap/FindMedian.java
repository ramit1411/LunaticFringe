package heap;

import java.util.*;

public class FindMedian {

	
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	
	public void insertNum(int number) {
		
		if(maxHeap.isEmpty() || maxHeap.peek() >= number) {
			maxHeap.add(number);
		}else {
			minHeap.add(number);
		}
		
		if(maxHeap.size() >= minHeap.size() + 1) {
			minHeap.add(maxHeap.poll());
		} else if(maxHeap.size() < minHeap.size()) {
			maxHeap.add(minHeap.poll());
		}
	}
	
	public double findMedian() {
		
		
		if(maxHeap.size() == minHeap.size()) {
			return (maxHeap.peek() / 2.0) + (minHeap.peek() / 2.0) ;
		}
		
		return maxHeap.peek();
	}
	
}
