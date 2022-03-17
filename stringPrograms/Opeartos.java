package stringPrograms;

import java.util.ArrayList;

public class Opeartos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println('a' + 'b');
		System.out.println("a" + "b");
		System.out.println((char)('a' + 3));
	
		System.out.println("a" + 1);
		//This is same as after few steps : "a" + "1"
		//int will get converted to Integer that will call toString()
		
		
		
		
		
		System.out.println("rmz" + new ArrayList<>());
		
	}

}
