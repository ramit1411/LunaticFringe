package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long answer = fact(5);
		System.out.println("The Factorial is : "+answer);
	}
	
	static long fact(long n) {
		
		if(n<=1) {
			return 1;
		}
		
		return n*fact(n-1);
	}

}
