package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {50,40,30,20,10,0,-10,-33,-22};
		selectionSort(arr);
	}
	
	static int maxValue(int[] arr, int start, int end) {
		
		int max = start;
		
		for(int i = start ; i<=end ;i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		
		return max;
	}
	
	static int[] swapElements(int[] arr,int element1,int element2) {
		int temp = arr[element1];
		arr[element1] = arr[element2];
		arr[element2] = temp;
		
		return arr;
	}
	
	static void selectionSort(int[] arr) {
		
		
		for(int i = 0;i<arr.length; i++) {
			//Find the max item in the remaining array and swap the correct index(which is the last of the effective array for each run)
			int last = arr.length - i - 1;
			
			int maxVal = maxValue(arr, 0, last);
			arr = swapElements(arr, maxVal, last);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
