package recursion;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		rev1(1234);
//		
//		System.out.println(sum);
		
		System.out.println(palindrome(1221));
	}

	static boolean palindrome(int n) {
		
		return (n == rev(n));
	}
	static int rev(int n) {
		
		int digits = (int)(Math.log10(n)) + 1;
		
		return helper(n,digits);
	}

	private static int helper(int n, int digits) {
		// TODO Auto-generated method stub

		if(n%10 == n) {
			return n;
		}
		
		int rem = n%10;
		
		return rem*(int)(Math.pow(10, digits-1)) + helper(n/10,digits-1);
	}
}
