package recursion;

public class FirstUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "geeksforgeeKKs";
		System.out.println(findUpper(input));
	}
	
	static char findUpper(String input) {
		
		if(input.isBlank()) {
			return '.';
		}
		
		if(Character.isUpperCase(input.charAt(0))) {
			return input.charAt(0);
		} else {
			return findUpper(input.substring(1));
		}
	}

}
