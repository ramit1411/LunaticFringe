package maths;

public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int b = 2;
		
		int ans = (int)(Math.log(n)/Math.log(b)) + 1;
		
		System.out.println(ans);
	}

}
