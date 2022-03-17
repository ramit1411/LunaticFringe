package maths;

public class SieveOfEratosthenes {

	//https://www.geeksforgeeks.org/sieve-of-eratosthenes/
	
//	/https://youtu.be/lmSpZ0bjCyQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ - timestamp - 14:00 min
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		boolean[] isPrime = new boolean[n+1];
		seive(n,isPrime);
	}
	
	static void seive(int n, boolean[] isPrime) {
		
		
		for(int i = 2 ; i*i <= n ; i++) {
			if(!isPrime[i]) {
				for(int j = i*2; j<= n;j+=i) {
					isPrime[j] = true;
				}
			}
		}
		
		for(int i = 2;i<=n;i++) {
			
			if(!isPrime[i]) {
				System.out.println(i+ " is Prime");
			}
			
		}
		
	}

}
