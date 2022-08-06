package recursion;

import java.util.Arrays;

public class BubbleSortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,1};
		
		Bs(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}
	
	static void Bs(int[] arr, int row,int col) {
		
		if(row == 0) {
			return;
		}
		
		if(col<row) {
			
			if(arr[col] > arr[col+1]) {
				int temp = arr[col];
				arr[col] = arr[col+1];
				arr[col+1] = temp;
			}
			Bs(arr,row,col+1);
		} else {
			
			Bs(arr,row-1,0);
		}
	}

}
