package general;

import java.util.Scanner;

public class PrimeNum {

	
	static void isPrime(int num) {
		
		if(num<=1) {
			System.out.print("neither prime nor composite");
		}
		
		int c = 2;
		boolean isPrime = true;
		/*
		 * For example for the number 18 - 
		 * 
		 * 18 * 1 = 18
		 * 9 * 2 = 18
		 * 6 * 3 = 18
		 * 3 * 6 = 18
		 * 2 * 9 = 18
		 * 1 * 18 = 18
		 * 
		 * so checking would have happend 6 times. But the steps are repeated, 
		 * therefore we are just checking till square root of the number given. So no repeated steps.
		 * 
		 * */
		 
		while((c*c) <= num) { //saving a lot of steps here. No need to search it num when we search till square root of num. Since numbers repeat later
			if(num%c == 0) {
				isPrime = false;
				break;
			} else {
				c++;
			}
		}
		
		if(isPrime){
			System.out.print("Is Prime");
		} else {
			System.out.print("Not Prime");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);   
		int a= sc.nextInt();  
		isPrime(a);
	}

}
