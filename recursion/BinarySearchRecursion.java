  package recursion;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,55,66,77,88};
		int target = 88;
		
		System.out.println(binarySearch(arr,target,0,arr.length-1));
	}
	
	static int binarySearch(int[] arr,int target,int start,int end) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = start + (end - start)/2;
		
		if(arr[mid] == target) {
			return mid;
		}
		
		if(target < arr[mid]) {
			return binarySearch(arr,target,start,mid-1);
		}
		
		return binarySearch(arr,target,mid+1,end);
		
	}

}
