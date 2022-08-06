package maths;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

	
	static long factorial(int N){
        // code here
        
        if(N == 1 || N == 0) {
            return 1;
        }
        
        return N * factorial(N-1);
    }
}
