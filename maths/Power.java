package maths;

public class Power {

	//good problem
	//https://youtu.be/fzip9Aml6og?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ - question 13
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base = 3;
		int power = 6;
		
		int ans = 1;
		
		while(power>0) {
			if((power&1) == 1) {
				ans*= base;
			}
			
			base *= base;
			power = power >> 1;
			
		}
		
		System.out.println(ans);
	}

}
