package maths;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 66;
		
		System.out.println(isOdd(num));
	}

	static boolean isOdd(int num) {
		return (num & 1) == 1;
		
		//In binary , any number's last digit can define whether its odd/even
		//also any number & 1 will give the same number, so if we get 1 then odd other wise even
		//Check notes for further explanation
		//https://youtu.be/fzip9Aml6og?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ - question 1
	}
}
