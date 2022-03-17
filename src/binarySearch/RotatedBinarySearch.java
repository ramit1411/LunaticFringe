package binarySearch;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,1,3};
		int target = 5;
		int pivot = getPivot(arr);
		int pos;
		
		//pivot s -1, the it means that normal binary search has to be done
		if(pivot == -1) {
			pos = getBinarySearch(arr, target, 0 , arr.length -1);
			System.out.println(pos);
		}
		
		//if pivot value is target then return the pivot value
		if(arr[pivot] == target) {
			pos = pivot;
			//return here
		}
		
		//if start is less than target then value must be in first half
		if(arr[0] <=  target) {
			pos = getBinarySearch(arr, target, 0 , pivot);
		} else {
			//if start is greater than target then value must be in second half
			pos = getBinarySearch(arr, target, pivot + 1 , arr.length - 1);
		}
		
		System.out.println(pos);
	}
	
	static int getPivot(int[] arr) {
		
		int start = 0;
		int end = arr.length -1 ;
		
		while(start<=end) {
			
			int mid =  start + ((end-start)/2); //This is done because start and end might be big numbers, so it might exceed the integer limit.
		
			// If the middle element is more than the adjacent values then it must be the highest element.
			//Therefore return them
			if(mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			} 
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			
			//If start element is greater than the middle element then the value must be in first half
			if(arr[start] >= arr[mid]) {
				end = mid - 1;
			} else if(arr[start] < arr[mid]) { //If start element is less than the middle element then the value must be in second half
				start = mid + 1;
			}
		}
		return -1;
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
