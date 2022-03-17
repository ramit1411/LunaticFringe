package recursion;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNum(1,10);

	}
	
    static void printNum(int i,int N) {
        
        if(i==(N+1)) {
            return;
        }
        
        System.out.println(i);
        printNum(i+1,N);
    }

}
