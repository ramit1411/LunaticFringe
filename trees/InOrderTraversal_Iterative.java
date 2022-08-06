package trees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal_Iterative {

	
	public static ArrayList < Integer > inOrder(Node root) {
		
		Stack<Node> st = new Stack<Node>();
		ArrayList < Integer > list = new ArrayList<Integer>();
		
		Node temp = root;
		while(true) {
			
			if(temp != null) {
				st.push(temp);
				temp = temp.left;
			} else {
				if(st.empty()) {
					break;
				}
				temp = st.pop();
				list.add(temp.data);
				temp = temp.right;
			}
		}
		
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

        ArrayList < Integer > inOrder;
        inOrder = inOrder(root);

        System.out.println("The inOrder Traversal is : ");
        for (int i = 0; i < inOrder.size(); i++) {
            System.out.print(inOrder.get(i) + " ");
        }
    }

}
