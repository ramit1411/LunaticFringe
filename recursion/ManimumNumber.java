package recursion;

public class ManimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 4, 3, -5, -4, 8, 6};
		System.out.println(maxNumberWithRecursion(arr,arr.length-1,-99999999));
	}
	
	
	static int maxNumberWithRecursion(int[] arr,int k,int max) {
		
		if(k == -1) {
			return max;
		}
		
		if(max < arr[k]) {
			max = arr[k];
		}
		
		return maxNumberWithRecursion(arr,k-1,max);
		
	}

}
