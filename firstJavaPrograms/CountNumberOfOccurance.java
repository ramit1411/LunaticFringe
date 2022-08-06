package firstJavaPrograms;

public class CountNumberOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5553555;
		int count = 0;
		while(num > 0) {
			
			int rem = num % 10;
			
			if(rem == 5) {
				count++;
			}
			
			num = num /10;
			
		}
		
		System.out.print(count);
	}

}
