package binarySearch;

//Order Agnostic mean when we dont know whether array is ascending or descending order.
public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {-11,-4,0,1,2,5,12,43,88};
		
		int[] arr = {99,88,66,32,1,0,-33,-99};
		int target = -99;
		
		int pos = getOrderAgnosticBinarySearch(arr, target);
		
		System.out.println(pos);
	}
	
	static int getOrderAgnosticBinarySearch(int[] arr,int target) {
		
		int start = 0;
		int end = arr.length -1 ;
		
		boolean isAsc = (arr[end] > arr[start]);
		
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
