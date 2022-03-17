package maths;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//facts1(20);
		facts2(20);
	}

	
	//Complexity - O(N)
	static void facts1(int n) {
		
		
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}
	
	//Optimized version
	// O(log(N))
	static void facts2(int n ) {
		
		int c = 1;
		
		while(c*c < n) {
			
			if(n%c == 0) {
				System.out.println(c);
				System.out.println(n/c);
			}
			
			c++;
		}
	}
}
