package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	
	public List<List<Integer>> levelOrder(Node root) {
		
		Queue<Node> que = new LinkedList<Node>();
		List<List<Integer>> mainList = new ArrayList<>();
		
		if(root==null) {
			return mainList;
		}
		que.offer(root);
		
		while(!que.isEmpty()) {
			int sizeQue = que.size();
			List<Integer> internalList = new ArrayList<Integer>();
			for(int i=0; i<sizeQue ;i++) {
				if(que.peek().left != null) {
					que.offer(que.peek().left);	
				}
				if(que.peek().right != null) {
					que.offer(que.peek().right);	
				}
				
				internalList.add(que.poll().data);
			}
			mainList.add(internalList);
		}
		return mainList;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println();

	}

}
