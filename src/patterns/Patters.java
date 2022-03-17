package patterns;

public class Patters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern3(5);
	}
	
	static void pattern3(int n) {
		
		for(int i=0;i<n;i++) {
			int k = n-i;
			for(int j=k;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
