package trees;


//class Node{
//	int data;
//	Node left;
//	Node right;
//	public Node(int key) {
//		data = key;
//		left = right = null;
//	}
//}

public class SimpleBinaryTree {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
		
		
	}

}
