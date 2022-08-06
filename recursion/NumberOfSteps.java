package recursion;

public class NumberOfSteps {

	//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfStepss(14));
	}
	
    static int numberOfStepss(int num) {
        return count(num,0);
    }
    
    static int count(int n,int c) {
        if(n==0) {
            return c;
        }
        
        if(n%2 == 0) {
            return count(n/2,c+1);
        }
        
        return count(n-1,c+1);
    }

}
