package trees;

public class BurnFromLeafToTreeBT {

	
	static class depth {
		int d;
		depth(int d) {
			this.d = d;
		}
	}
	
	static int ans = -1;
	
	static int minTime(Node root,int target) {
		depth depth = new depth(-1);
		burn(root,target,depth);
		return ans;
	}
	
	static int burn(Node root,int target,depth dep) {
		
		if(root == null) {
			return 0;
		}
		
		if(root.data == target) {
			dep.d = 1;
			return 1;
		}
		
		depth depLeft = new depth(-1);
		depth depRight = new depth(-1);
		
		int heightLeft = burn(root.left,target,depLeft);
		int heightRight = burn(root.right,target,depRight);
		
		if(depLeft.d != -1) {
			ans = Math.max(ans, depLeft.d + 1 + heightRight);
			dep.d = depLeft.d + 1;
		}
		
		if(depRight.d != -1) {
			ans = Math.max(ans, depRight.d + 1 + heightLeft);
			dep.d = depRight.d +1;
		}
		
		return Math.max(heightLeft, heightRight) + 1;
		
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
	        
	        
	        int ans = minTime(root,7);
	        
	        System.out.println(ans);

	}
}
