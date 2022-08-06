package trees;

public class LowestCommonAncestor {

	
	static Node lca(Node root,int n1,int n2) {
		
		if(root == null) {
			return null;
		}
		
		if(root.data == n1 || root.data == n2) {
			return root;
		}
		
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		
		if(left == null) {
			return right;
		}
		
		if(right == null) {
			return left;
		}
		
		return root;
		
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
	        
	        
	        Node ans = lca(root,4,8);
	        
	        System.out.println(ans.data);

	}

}
