package maths;

public class FindUnqiue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {2,3,3,4,6,4,2};
		
		System.out.println(isUni(numArr));
	}

	static int isUni(int[] numArr) {
		
		int unique = 0;
		
		for(int n: numArr) {
			System.out.println("unique 1 - "+unique);
			unique = unique ^ n;
			System.out.println("unique 2 - "+unique);
			//https://www.loginradius.com/blog/async/how-does-bitwise-xor-work/
			// XORing all the numbers, the unique of the array remains.
			// for xor calculation visit above website
			// Thank yourself later.
			
		}
		
		return unique;
	}
	
}
