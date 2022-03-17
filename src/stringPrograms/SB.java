package stringPrograms;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder build = new StringBuilder();
		
		for(int i=0;i<26;i++) {
			char ch = (char)('a'+i);
			build.append(ch);
		}
		
		System.out.println(build.toString());
	}

}
