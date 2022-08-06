package recursion;

public class StringSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(skip("abbccdaase",""));
		
//		System.out.println(skip2("abbccdaase"));////
		

//		System.out.println(skipApple("abbcapplecdaase"));
		

		System.out.println(skipAppleNotApple("abbcapplecdaappase"));
	}
	
	static String skip(String og,String nw) {
		
		if(og.isBlank()) {
			return nw;
		}
		
		char ch = og.charAt(0);
		
		if(ch == 'a') {
			return skip(og.substring(1),nw);
		}else {
			nw += ch;
			return skip(og.substring(1),nw);
		}
	}
	
	static String skip2(String og) {
		
		if(og.isBlank()) {
			return "";
		}
		
		char ch = og.charAt(0);
		
		if(ch == 'a') {
			return skip2(og.substring(1));
		} else {
			return ch + skip2(og.substring(1));
		}
	}
	
	static String skipApple(String og) {
		
		if(og.isBlank()) {
			return "";
		}
		
		
		if(og.startsWith("apple")) {
			return skipApple(og.substring(5));
		} else {
			return og.charAt(0) + skipApple(og.substring(1));
		}
	}
	
	static String skipAppleNotApple(String og) {
		
		if(og.isBlank()) {
			return "";
		}
		
		
		if(og.startsWith("app") && !og.startsWith("apple")) {
			return skipAppleNotApple(og.substring(3));
		} else {
			return og.charAt(0) + skipAppleNotApple(og.substring(1));
		}
	}
	

}
