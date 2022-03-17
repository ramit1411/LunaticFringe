package recursion;

public class FirstUppercaseLetterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rmzfmsdtW";
		System.out.println(findUpperIndex(0,str));
	}

	
	static char findUpperIndex(int i,String str) {
		
		if(str.charAt(i) == '\0') {
			return 0;
		}
		
		if(Character.isUpperCase(str.charAt(i))) {
			return str.charAt(i);
		}
		
		return findUpperIndex(i+1,str);
	}
}
