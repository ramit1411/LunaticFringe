package maths;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(36));
	}
	
	static boolean isPrime(int n) {
		
		int c = 2;
		
		while((c*c) <= n) {
			
			if(n%c == 0) {
				return false;
			}
			c++;
		}
		
		return true;
	}
	
	

}
