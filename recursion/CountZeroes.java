package recursion;

public class CountZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(30004002));
	}

	static int count(int n) {
		return helper(n,0);
	}
	
	//special pattern, how to pass values to above calls
	static int helper(int n,int c) {
		
		if(n==0) {
			return c;
		}
		
		if(n%10 == 0) {
			return helper(n/10,c+1);
		}
		
		return helper(n/10,c);
	}
}
