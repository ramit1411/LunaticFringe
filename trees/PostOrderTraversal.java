package trees;

import java.util.ArrayList;

public class PostOrderTraversal {

	//class Node{
//	int data;
//	Node left;
//	Node right;
//	public Node(int key) {
//		data = key;
//		left = right = null;
//	}
//}
	public static ArrayList<Integer> postOrder(Node head) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(head == null) {
			return list;
		}
		
		list.addAll(postOrder(head.left));
		list.addAll(postOrder(head.right));
		list.add(head.data);
		
		return list;
	}
	
    public static void main(String args[]) {

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

        ArrayList < Integer > preOrderList = postOrder(root);

        System.out.print("The postOrder Traversal is : ");
        for (int i = 0; i < preOrderList.size(); i++) {
            System.out.print(preOrderList.get(i) + " ");
        }

    }

}
