package trees;

public class BinaryTreeToDLL {

	Node head = null,prev = null;
	public void convertToDLL(Node root) {
		if(root == null) {
		       return;
		}
		convertToDLL(root.left);
	
		if(prev == null) {
		      head = root;
		} else {
			prev.right = root;
			root.left = prev;
		}
		prev = root;
		convertToDLL(root.right);

	}
}
