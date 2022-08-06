package recursion;

import java.util.ArrayList;

public class PhonePad {

	//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
	
	//https://youtu.be/9ByWqPzfXDU?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pad("","12");
	
//		System.out.println(padList("","12"));
		
		System.out.println(padCount("","12"));
	}
	
	static void pad(String p,String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit = up.charAt(0) - '0'; //Converting from char value to int value 
		
		for (int i = (digit-1)*3;i<digit*3;i++) {
			char ch = (char) ('a' + i);
			
			pad(p+ch,up.substring(1));
		}
		
	}
	
	static ArrayList<String> padList(String p,String up) {
		
		if(up.isEmpty()) {
			
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		int digit = up.charAt(0) - '0'; //Converting from char value to int value 
		ArrayList<String> list = new ArrayList<String>();
		for (int i = (digit-1)*3;i<digit*3;i++) {
			char ch = (char) ('a' + i);
			
			list.addAll(padList(p+ch,up.substring(1)));
		}
		
		return list;
		
	}
	
	static int padCount(String p,String up) {
		
		if(up.isEmpty()) {
//			System.out.println(p);
			return 1;
		}
		
		int digit = up.charAt(0) - '0'; //Converting from char value to int value 
		int count = 0;
		
		for (int i = (digit-1)*3;i<digit*3;i++) {
			char ch = (char) ('a' + i);
			
			count = count + padCount(p+ch,up.substring(1));
		}
		return count;
	}
	
	
	

}
