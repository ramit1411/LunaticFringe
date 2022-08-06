package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFreuencyNumbers {

	static void Kfreq(int[] arr,int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq  = new PriorityQueue<>(
				(n1,n2) -> n1.getValue() - n2.getValue()
				);
		
		for(Entry<Integer, Integer> i : map.entrySet()) {
			pq.add(i);
			
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
		int[] arr = {1,1,1,3,2,2,4};
		Kfreq(arr,2);
		
	}
}
