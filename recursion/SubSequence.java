package recursion;

import java.util.ArrayList;
import java.util.Stack;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		subSeq("","abc");
		
//		System.out.println(subSeqArrayList("","abc"));
		
//		subSeqASCII("","abc");
		
//		System.out.println(subSeqArrayListAscii("","abc"));
		
		Stack<Integer> st = new Stack<>();
		st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(7);
        st.push(4);
        st.push(8);
        st.push(4);
        
        System.out.println("Original Stack" + st);
        System.out.println("Reversed Stack" + reverseStack(st));
        
        
        
	}

	
	static void subSeq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		subSeq(p+ch,up.substring(1));
		subSeq(p,up.substring(1));
		
	}
	
	static ArrayList<Integer> reverseStack(Stack<Integer> st) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(st.isEmpty()) {
			return list;
		}
		
		list.add(st.pop());
		list.addAll(reverseStack(st));
		return list;
	}
	
	
	
	static ArrayList<String> subSeqArrayList(String p, String up) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		if(up.isEmpty()) {
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> left = subSeqArrayList(p+ch,up.substring(1));
		ArrayList<String> right = subSeqArrayList(p,up.substring(1));
		
		list.addAll(left);
		list.addAll(right);
		
		return list;
	}
	
	static void subSeqASCII(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		subSeqASCII(p+ch,up.substring(1));
		subSeqASCII(p,up.substring(1));
		subSeqASCII(p+(ch+0),up.substring(1));
		
	}
	
	
	static ArrayList<String> subSeqArrayListAscii(String p, String up) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		if(up.isEmpty()) {
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> left = subSeqArrayListAscii(p+ch,up.substring(1));
		ArrayList<String> right = subSeqArrayListAscii(p,up.substring(1));
		ArrayList<String> third = subSeqArrayListAscii(p+(ch+0),up.substring(1));
		
		
		list.addAll(left);
		list.addAll(right);
		list.addAll(third);
		
		return list;
	}
	
}

