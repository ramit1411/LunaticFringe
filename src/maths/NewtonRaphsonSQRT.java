package maths;

public class NewtonRaphsonSQRT {

	public static double precision = 0.01;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(40));
	}
	//https://youtu.be/lmSpZ0bjCyQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=3307 
	//https://www.geeksforgeeks.org/program-for-newton-raphson-method/
	static double sqrt(int n) {
		
		
		double root;
		double x = n;
		while(true) {
			
			root = 0.5 * (x + (n/x)); //Newton Raphson Method
			
			if(Math.abs(root-x) < precision) {
				return root;
			}
			
			x = root;
		}
	}

}
