package recursion;

public class DigitProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = product(505);
		System.out.println("The product of the number is "+product);
	}

	static int product(int n) {
		
		if(n==0) {
			return 1;
		}
		
		return (n%10) * product(n/10);
	}
}
