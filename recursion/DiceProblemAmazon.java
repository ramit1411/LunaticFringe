package recursion;

import java.util.ArrayList;

public class DiceProblemAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		dice("",4);
		
		System.out.println(diceList("",4));
	}

	
	static void dice(String p,int target) {
		
		if(target== 0) {
			System.out.println(p);
			return;
		}
		
		
		for(int i=1;i<=6&&i<=target;i++) {
			dice(i+p,target-i);
		}
	}
	
	static ArrayList<String> diceList(String p,int target) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		if(target== 0) {
			list.add(p);
			return list;
		}
		
		
		for(int i=1;i<=6&&i<=target;i++) {
			list.addAll(diceList(i+p,target-i));
		}
		
		return list;
	}
	
	//Custom dice face for example 7 or 8 sided die.
	
	static void diceFace(String p,int target,int face) {
		
		if(target== 0) {
			System.out.println(p);
			return;
		}
		
		
		for(int i=1;i<=face&&i<=target;i++) {
			diceFace(i+p,target-i,face);
		}
	}
	
	static ArrayList<String> diceListFace(String p,int target,int face) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		if(target== 0) {
			list.add(p);
			return list;
		}
		
		
		for(int i=1;i<=face&&i<=target;i++) {
			list.addAll(diceListFace(i+p,target-i,face));
		}
		
		return list;
	}
}
