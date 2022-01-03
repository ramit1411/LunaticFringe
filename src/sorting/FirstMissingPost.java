package sorting;

import java.util.Arrays;

public class FirstMissingPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,-1,1};
		System.out.println(Arrays.toString(cyclicSort(arr)));
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] != i+1) {
				System.out.println(i+1);
				break;
			}
		}
		
//		return arr.length+1;
	}
	
	static int[] cyclicSort(int[] arr) {
		
		int i = 0;
		
		while(i<arr.length) {
			
			if(arr[i]!= i+1) {
				
				int correctIndex = arr[i] - 1;
				
				if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
					arr = swapElements(arr,i,correctIndex);
				} else {
					i++;
				}	
			} else {
				i++;
			}
		}
		return arr;
	}
	
    static int[] swapElements(int[] arr,int element1,int element2) {
		int temp = arr[element1];
		arr[element1] = arr[element2];
		arr[element2] = temp;
		
		return arr;
	}
}
