package maths;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32; //fix n = 0, since it gives false
		
		
		boolean ans = (n & (n-1)) == 0? true:false;
		
		if(n == 0)  {
			ans = false;
		}

		System.out.println(ans);
		
		//SEE notes for explanation
		//https://youtu.be/fzip9Aml6og?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ - question 12
	}

}
