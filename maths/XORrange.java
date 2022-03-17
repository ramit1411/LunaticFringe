package maths;

public class XORrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 9;
		
		System.out.println(findXOR(b)^findXOR(a-1));
	}
	
	static int findXOR(int n) {
		
		if(n % 4 == 0) {
			return n;
		}
		
		if(n % 4 == 1) {
			return 1;
		}
		
		if(n % 4 == 2) {
			return n+1;
		}
		
		if(n % 4 == 3) {
			return 0;
		}
		
		return 0;
	}

}
