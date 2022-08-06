package recursion;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 3, -5, -4, 8, 6};
		MaxMinFind(arr,0,99999999,-99999999);
	}

	
	static void MaxMinFind(int[] arr,int k,int min,int max) {
		
		if(k==arr.length) {
			System.out.println("Max - "+max);
			System.out.println("Min - "+min);
			return;
		}
		
		
		if(arr[k] > max) {
			max = arr[k];
		}
		
		if(arr[k] < min) {
			min = arr[k];
		}
		
		MaxMinFind(arr,k+1,min,max);
		
	}
}
