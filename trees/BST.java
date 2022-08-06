package trees;

public class BST {

	
	public Node insert(Node root,int key) {
		
		Node keyNode = new Node(key);
		
		Node current = root;
		Node parent = null;
		
		while(current!=null) {
			parent = current;
			
			if(key < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		
		if(parent == null) {
			parent = keyNode;
		} else if(key > parent.data) {
			parent.right = keyNode;
		} else {
			parent.left = keyNode;
		}
		
		return parent;
	}
	
	
	//Approach 1 - Range Approach For finding if BST
	public boolean isBST(Node root) {	
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public boolean isBSTUtil(Node root, int min, int max) {
		// TODO Auto-generated method stub
		if(root == null) {
			return true;
		}
		
		if(root.data < min || root.data > max) {
			return false;
		}
		
		return (isBSTUtil(root.left,min,root.data-1) && isBSTUtil(root.right,root.data+1,max));
	}

	
	//Approach 2 Previous and Current check Approach For finding if BST
	Node prev = null;
	public boolean isBST2(Node node) {
		if(node!=null) {
			if(!isBST2(node.left)) {
				return false;
			}

			if(prev!= null  && node.data <= prev.data) {
				return false;
			}
			
			prev = node;
			return isBST2(node.right);
		} 
		
		return true;
	}
	
	public Node delete(Node root,int key) {
		
		if(root == null) {
			return root;
		}
		
		if(root.data < key) {
			root.right = delete(root.right,key);
		} else if(root.data > key) {
			root.left = delete(root.left,key);
		} else {
			if(root.left == null) {
				return root.right;
			} else if(root.right == null) {
				return root.left;
			}
			
			root.data = minVal(root);
			root.right = delete(root.right,key);	
		}
		
		return root;	
	}


	private int minVal(Node root) {
		// TODO Auto-generated method stub
		
		int min = root.data;
		while(root!=null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	
	
	// Floor and Ceil in BST
	public static int floor(Node root,int key) {
		
		int ans = Integer.MAX_VALUE;
		
		while(root != null) {
			if(root.data == key) {
				return root.data;
			}
			
			if(root.data > key) {
				root = root.left;
			} else {
				ans = root.data;
				root = root.right;
			}
		}
		
		return ans;		
	}
	
	public static int ceil(Node root,int key) {
		
		int ans = Integer.MIN_VALUE;
		
		while(root != null) {
			if(root.data == key) {
				return root.data;
			}
			
			if(root.data > key) {
				ans = root.data;
				root = root.left;
			} else {
				root = root.right;
			}
		}
		
		return ans;		
	}
}
