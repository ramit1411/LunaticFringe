package binarySearch;

public class BSinfiniteLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-11,-4,0,1,2,5,12,43,88}; //Imagine this is going on till infinity
		int target = 5;
		
		int pos = getBinarySearchInInfiniteLength(arr, target);
		
		System.out.println(pos);
	}
	
	static int getBinarySearchInInfiniteLength(int[] arr,int target) {
		
		int start = 0;
		int end = 1 ;
		
		while(target > arr[end]) {
			int temp = end + 1; //this is my new start
			
			//end = previous end + size of new box*2
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		
		return getBinarySearch(arr, target, start, end);
	}
	
	
	static int getBinarySearch(int[] arr,int target,int start,int end) {
		
		while(start<=end) {
			
			int mid =  start + ((end-start)/2); //This is done because start and end might be big numbers, so it might exceed the integer limit.
			
			if(target > arr[mid]) {
				start = mid + 1;
			} else if(target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}

}
