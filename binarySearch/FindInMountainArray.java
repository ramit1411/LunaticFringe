package binarySearch;

public class FindInMountainArray {

	//LEETCODE HARD
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-11,-4,0,1,2,5,12,3,-9};
		int target = 3;
		int peekHeight = getHighestEnd(arr);
		int pos = getOrderAgnosticBinarySearch(arr, target, 0 , peekHeight);
		
		if(pos != -1) {
			System.out.println(pos);
		} else {
			pos = getOrderAgnosticBinarySearch(arr, target,  peekHeight + 1, arr.length - 1);
			
			System.out.println(pos);
		}
		
		
	}
	 
	static int getHighestEnd(int[] arr) {
		
		int start = 0;
		int end = arr.length -1 ;
		
		while(start<end) {
			
			int mid =  start + ((end-start)/2); //This is done because start and end might be big numbers, so it might exceed the integer limit.
			
			if(arr[mid+1] > arr[mid]) {
				start = mid + 1; //we are in the ascending part of the array
			} else {
				end = mid; // we are in the desc part of the array. 
			}
		}
		
		return start;
	}
	
	static int getOrderAgnosticBinarySearch(int[] arr,int target,int start,int end) {
		
		boolean isAsc = (arr[end] > arr[start]); //We taking end element instead of start+1, coz arr[start] & arr[start+1] 
		//can have same elements, so safest bet to check asc or desc is by checking first and last elements
		while(start<=end) {
			
			int mid =  start + ((end-start)/2); //This is done because start and end might be big numbers, so it might exceed the integer limit.
		
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
				if(target > arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				} 
			} else {
				if(target < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				} 
			}
			
		}
		
		return -1;
	}

}
