package sorting;

import java.util.Arrays;

//Also known as Sinking Sort/Exchange Sort
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {50,40,30,20,10,0,-10,-33,-22};
		bubbleSort(arr);
	}
	
	static void bubbleSort(int[] arr) {
		//Crux of this sort is that with each pass, the highest element reaches the end of the array with each step.
		
		for(int i = 0;i<arr.length ; i++) {
			boolean isSorted = true;
			
			for(int j = 1;j<arr.length - i;j++) { // n- i is done here because in the first iteration highest element is already in the end. No point checking that element again
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					isSorted = false; //checking whether the array has been sorted in previous pass or was already sorted from beginning
				}
			} 
			
			if(isSorted) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
