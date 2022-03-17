package maths;

public class GCD_LCM {

	//https://youtu.be/lmSpZ0bjCyQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ
	
	//last part of the video
	
	// a*b = hcf(a,b) * lcm(a,b)
	// hcf(a,b) = hcf((b%a),a); Euclids algo
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(4,8));
		System.out.println(LCM(4,8));
	}
	
	static int GCD(int a,int b) {
		
		if(a==0) {
			return b;
		}
		
		return GCD(b%a,a);
	}
	
	static int LCM(int a,int b) {
		
		return ((a*b)/GCD(a,b));
	}
	

}
