package trees;

import java.util.*;

public class TopBottomView {

	public static class Pair {
		
		int horizontalDistance;
		Node root;
		
		public Pair(int horizontalDistance,Node root) {
			this.horizontalDistance = horizontalDistance;
			this.root = root;
		}
	}
	
	public static TreeMap<Integer,Integer> TopView(Node root) {
		
		
		TreeMap<Integer,Integer> topViewMap = new TreeMap<Integer,Integer>();
		Queue<Pair> queue = new ArrayDeque<>();
		
		if(root == null) {
			return topViewMap;
		}
		
		queue.offer(new Pair(0,root));
		
		while(!queue.isEmpty()) {
			
			Pair curr = queue.poll();
			
			if(!topViewMap.containsKey(curr.horizontalDistance)) {
				topViewMap.put(curr.horizontalDistance, curr.root.data);
			}
			
			if(curr.root.left != null) {
				queue.offer(new Pair(curr.horizontalDistance - 1,curr.root.left));
			}
			
			if(curr.root.right != null) {
				queue.offer(new Pair(curr.horizontalDistance + 1,curr.root.right));
			}	
		}
			
		return topViewMap;
	}
	
	
	public static TreeMap<Integer,Integer> BottomView(Node root) {
		
		
		TreeMap<Integer,Integer> topViewMap = new TreeMap<Integer,Integer>();
		Queue<Pair> queue = new ArrayDeque<>();
		
		if(root == null) {
			return topViewMap;
		}
		
		queue.offer(new Pair(0,root));
		
		while(!queue.isEmpty()) {
			
			Pair curr = queue.poll();
			
			topViewMap.put(curr.horizontalDistance, curr.root.data);
			
			if(curr.root.left != null) {
				queue.offer(new Pair(curr.horizontalDistance - 1,curr.root.left));
			}
			
			if(curr.root.right != null) {
				queue.offer(new Pair(curr.horizontalDistance + 1,curr.root.right));
			}	
		}
			
		return topViewMap;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(15);
	        root.left.right.left = new Node(8);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        root.right.right.left = new Node(9);
	        root.right.right.right = new Node(10);
	        
	        System.out.println(TopView(root));
	        System.out.println(BottomView(root));
	}
	
	

}
