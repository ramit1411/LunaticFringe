package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {50,40,30,20,10,0,-10,-33,-22};
		bubbleSort(arr);
	}
	
	static void bubbleSort(int[] arr) {
		
		
		for(int i = 0;i<arr.length ; i++) {
			boolean isSorted = true;
			
			for(int j = 1;j<arr.length - i;j++) { // n- i is done here coz in the first iteration highest element is already in the end. No point checking that element again
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				isSorted = false;
			}
			
			if(isSorted) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
