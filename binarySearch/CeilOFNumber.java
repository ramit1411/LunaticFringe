package binarySearch;

public class CeilOFNumber {

	
	public static int ceilOfANumber(int[] array,int target) {
		int start = 0;
		int end = array.length - 1;

		while(start<=end) {
			int mid = start + ((end-start)/2);
			
			if(mid == target) {
				return mid;
			}

			if(mid < target) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return start; //ceil of the number
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-11,-4,0,1,2,5,12,43,88};
		int target = 111;
		
		int pos = ceilOfANumber(arr, target);
		
		System.out.println(pos);
	}

}
