package maths;

public class BinarySearchSQRT {

	public static void main(String[] args) {
		
		
		System.out.println(findSqrt(41,3));
	}
	
	//n = number
	//p = precision
	//O(logN)
	static double findSqrt(int n,int p) {
		
		int s = 1;
		int e = n;
		
		double root = 0.0;
		
		while(s<=e) {
			int mid = s + (e-s) / 2;
			root = mid;
			
			if(mid*mid == n) {
				return mid;
			}	
			if(mid*mid > n) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		double incr = 0.1;
		
		for(int i = 0;i<p;i++) {
			while(root*root <= n) {
				root += incr;
			}
			root -= incr;
			incr = incr/10;
		}
		return root;
	}
}
