package recursion;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sum(1432);
		System.out.println("The Sum of the number is "+sum);
	}

	static int sum(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return (n%10) + sum(n/10);
	}
}
