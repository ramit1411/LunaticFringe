package trees;

import java.util.ArrayList;


public class PreOrderTraversal {

	//class Node{
//	int data;
//	Node left;
//	Node right;
//	public Node(int key) {
//		data = key;
//		left = right = null;
//	}
//}
	public static ArrayList<Integer> preOrder(Node head) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(head == null) {
			return list;
		}
		
		list.add(head.data);
		list.addAll(preOrder(head.left));
		list.addAll(preOrder(head.right));
		
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

        ArrayList < Integer > preOrderList = preOrder(root);

        System.out.print("The preOrder Traversal is : ");
        for (int i = 0; i < preOrderList.size(); i++) {
            System.out.print(preOrderList.get(i) + " ");
        }

    }
}
