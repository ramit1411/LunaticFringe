package recursion;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strCheck("{[()]}",""));
	}
	
	
	static boolean strCheck(String p,String up) {
		
		if(p.isEmpty() && up.isEmpty()) {
			return true;
		}
		
		
		if(p.length() > 0 && (p.charAt(0) == '(' || p.charAt(0) == '{' || p.charAt(0) == '[')) {
			up = p.charAt(0)+up;
			return strCheck(p.substring(1),up);
		}
		
		if(p.length() > 0 && (p.charAt(0) == ')' || p.charAt(0) == '}' || p.charAt(0) == ']')) {
			
			if((p.charAt(0) == ']' && up.length() > 0 && up.charAt(0) == '[') || 
					(p.charAt(0) == '}' && up.length() > 0 && up.charAt(0) == '{') || 
						(p.charAt(0) == ')' && up.length() > 0 && up.charAt(0) == '(')) {
				return strCheck(p.substring(1),up.substring(1));
			} else {
				return false;
			}
		}
		
		return false;
	}

}
