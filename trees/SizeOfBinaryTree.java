package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SizeOfBinaryTree {

	
	//both for size of binary tree
	static int num(Node root) {
		int totalNode = 0;
		
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		totalNode++;
		if(root.left != null) {
			totalNode += num(root.left);
		}
		
		if(root.right!= null) {
			totalNode += num(root.right);
		}
		return totalNode;
	}
	//both for size of binary tree
	static int size(Node root) {
		if(root == null) {
			return 0;
		}
		
		return size(root.left) + size(root.right) + 1;
	}
	
	
	static int maxInBT(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.data, Math.max(maxInBT(root.left), maxInBT(root.right)));
	}
	
	static void leftRightViewBTPrint(Node root) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
//		ArrayList<Integer> list = new ArrayList<>();
		leftViewBT(root,0,map);
		System.out.println("Left View ");
		for(Integer i : map.values()) {
			System.out.print(i + "-> ");
		}
		
		
		System.out.println("Right View ");
		RightViewBT(root,0,map);
		for(Integer i : map.values()) {
			System.out.print(i + "-> ");
		}
		
		HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		
		System.out.println("Right View 2");
		RightViewBT2(root,0,map);
		for(Integer i : map.values()) {
			System.out.print(i + "-> ");
		}
		
		
		
	}
	
	static void leftViewBT(Node root,int level,HashMap<Integer,Integer> map) {
		
		if(root == null) {
			return;
		}
		
		if(!map.containsKey(level)) {
			map.put(level, root.data);
		}
		
		leftViewBT(root.left,level+1,map);
		leftViewBT(root.right,level+1,map);
	}
	
	static void RightViewBT(Node root,int level,HashMap<Integer,Integer> map) {
		
		if(root == null) {
			return;
		}
		
		map.put(level, root.data);
		
		RightViewBT(root.left,level+1,map);
		RightViewBT(root.right,level+1,map);
	}
	
	static void RightViewBT2(Node root,int level,HashMap<Integer,Integer> map) {
		
		if(root == null) {
			return;
		}
		
		if(!map.containsKey(level)) {
			map.put(level, root.data);
		}
		
		RightViewBT2(root.right,level+1,map);
		RightViewBT2(root.left,level+1,map);
		
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
	        
//        System.out.println(size(root));
        leftRightViewBTPrint(root);
//        System.out.println(maxInBT(root));
	        
	}
}
