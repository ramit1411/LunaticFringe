package recursion;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		perm("","abc");
		
//		System.out.println(permList("","abcd"));
		System.out.println(permCount("","abcd"));
	}
	
	static void perm(String p,String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		for(int i=0;i<= p.length();i++) {
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			perm(first+ch+second,up.substring(1));
		}
	}

	
	static ArrayList<String> permList(String p,String up) {
		
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<= p.length();i++) {
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			list.addAll(permList(first+ch+second,up.substring(1)));
		}
		
		return list;
	}
	
	static int permCount(String p,String up) {
		
		if(up.isEmpty()) {
			return 1;
		}
		
		char ch = up.charAt(0);
		
		int count = 0;
		
		for(int i=0;i<= p.length();i++) {
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			count = count + permCount(first+ch+second,up.substring(1));
		}
		
		return count;
	}
}
