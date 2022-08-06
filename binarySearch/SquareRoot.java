package binarySearch;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {-11,-4,0,1,2,5,12,43,88};
		int target = 8;
		
		int pos = mySqrt(target);
		
		System.out.println(pos);
	}
	
    public static int mySqrt(int x) {
        int start = 1;
        int end = x/2;
        
        int mid = -1;
        
        
        while(start<=end) {
            
            mid = start + ((end-start)/2);
            
            if(mid == (x/mid)) { //This logic is important
                return mid;
            }
            if(mid > (x/mid)) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        
        return end;
    }

}
