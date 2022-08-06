package trees;

public class HeightOFBinaryTree {

	
	static int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		return Math.max(height(root.left),height(root.right)) + 1;
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
	        
        System.out.println(height(root));
	        
	}

}
