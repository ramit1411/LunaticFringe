package recursion;

public class Fibonacchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = fibo(9);
		System.out.println(k);
		
	}
	
	static int fibo(int n) {
		
		if(n<2) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}

}
