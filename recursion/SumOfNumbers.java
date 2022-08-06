package recursion;

public class SumOfNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long answer = sum(5);
		System.out.println("The Sum is : "+answer);
	}
	
	static long sum(long n) {
		
		if(n<=1) {
			return 1;
		}
		
		return n+sum(n-1);
	}

}
