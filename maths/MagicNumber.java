package maths;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(magicNum(6,5));
	}
	
	//AMAZON 
	static int magicNum(int n,int multiplyNum) {
		
		int ans = 0;
		int base = multiplyNum;
		while(n>0) {
			int lastDigit = n & 1;
			n = n >> 1;
			ans += lastDigit* base;
			base = base * multiplyNum;
		}
		return ans;
	}

}
