package recursion;

public class MiniumunNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 4, 3, -5, -4, 8, 6};
		System.out.println(minimumNumberWithRecursion(arr,arr.length-1,99999999));
	}
	
	
	static int minimumNumberWithRecursion(int[] arr,int k,int min) {
		
		if(k == -1) {
			return min;
		}
		
		if(min > arr[k]) {
			min = arr[k];
		}
		
		return minimumNumberWithRecursion(arr,k-1,min);
		
	}

}
