package binarySearch;

//Ceiling of a number
//Find the number which is the first number to be greater than or equal to the target number given
public class FirstGreatestOrEqualNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,9};
		int target = 4;
		
		int val = getGreatestOrEqualNumber(arr,target);
		System.out.print(val);
	}

	static int getGreatestOrEqualNumber(int[] arr,int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		int mid;
		while(start<=end) {
			
			mid = start + ((end-start)/2);
			
			if(arr[mid] > target) {
				end = mid - 1;
			} else if(arr[mid] < target){
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return start;	
	}
}
