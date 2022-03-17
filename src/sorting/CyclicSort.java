package sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,5,2,1,4};
		cycSort(arr);
	}
	
	
	static int[] swapElements(int[] arr,int element1,int element2) {
		int temp = arr[element1];
		arr[element1] = arr[element2];
		arr[element2] = temp;
		
		return arr;
	}
	
	// For elements in 1 to N , in a sorted array the value will be at N-1. So we use that logic here to sort the array in O(N) complexity.
	static void cycSort(int[] arr) {
		
		int i = 0;
		while(i<arr.length) {
			if((arr[i] - 1) != i) {
				arr = swapElements(arr,i,arr[i] - 1);
				System.out.println(Arrays.toString(arr));
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

