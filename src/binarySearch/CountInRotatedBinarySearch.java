package binarySearch;

public class CountInRotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,5,6,7,0,1,2,3};
		int pivot = getPivot(arr);
		System.out.println((arr.length - 1) - (pivot));
		System.out.println((pivot+1));
	}
	
	static int getPivot(int[] a) {
		
		int start = 0;
		int end = a.length - 1;
		int mid;
		
		while(start<=end) {
			
			mid = start + ((end-start)/2);
			
			
			if(mid < end && a[mid] > a[mid+1]) {
				return mid;
			}
			
			if(mid > start && a[mid-1] > a[mid]) {
				return mid;
			}
			
			if(a[start] >= a[mid]) {
				end = mid - 1;
			} else if(a[start] < a[mid]) { //If start element is less than the middle element then the value must be in second half
				start = mid + 1;
			}
		}
		
		return -1;
		
	}
	
}
