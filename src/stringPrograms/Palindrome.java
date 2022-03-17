package stringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcba";
		System.out.print(isPalindrome(str));
	}
	
	static Boolean isPalindrome(String str) {
		
		if(str==null || str.length() == 0) {
			return false;
		}
		
		for(int i=0;i<=str.length() /2 ; i++) {
			char s = str.charAt(i);
			char e = str.charAt(str.length()-1-i);
			
			if(s != e) {
				return false;
			}
		}
		
		return true;
	}

}
