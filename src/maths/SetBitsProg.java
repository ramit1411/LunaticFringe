package maths;

public class SetBitsProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 34;
		System.out.println( Integer.toBinaryString(n) );
		System.out.println(SetBits(n));
	}

	private static int SetBits(int n) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		
		while(n > 0) {
			
			 n = n - (n & (-n));
			 // also this can be done
//			  n = n & (n-1);
			 counter++;
		}
		return counter;
	}

}
