package recursion;

public class OneToN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func2(5);
	}

	
//	static void func(int n) {
//		
//		if(n==0) {
//			return;
//		}
//		
//		func(n-1);
//		System.out.println(n);
//	}
	
	//print in reverse then straight
	static void func2(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		func2(n-1);
		System.out.println(n);
	}
}
