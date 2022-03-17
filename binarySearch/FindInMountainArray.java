package binarySearch;

public class FindInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-11,-4,0,1,2,5,12,3,-9};
		int target = 0;
		
		int pos = getBinarySearch(arr, target);
		
		System.out.println(pos);
	}
	
	static int getHighestEnd(int[] arr) {
		
		int start = 0;
		int end = arr.length -1 ;
		
		while(start<end) {
			
			int mid =  start + ((end-start)/2); //This is done because start and end might be big numbers, so it might exceed the integer limit.
			
			if(arr[mid+1] > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		
		return start;
	}
	
	static int getBinarySearch(int[] arr,int target) {
		
		int start = 0;
		int end = getHighestEnd(arr);
		
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
