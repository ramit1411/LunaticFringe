package firstJavaPrograms;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123456;
		int newNum = 0;
		while(num > 0) {
			
			int rem = num % 10;
			
			newNum = newNum*10 + rem;
			
			num = num /10;
			
		}
		
		System.out.print(newNum);
	}

}
