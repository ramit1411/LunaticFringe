package recursion;

import java.util.Arrays;

public class mergeSortRecursionInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,4,3,2,1};
		mergeSortInPlaceInPlace(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	static void mergeSortInPlaceInPlace(int[] arr,int s,int e) {
		if((e-s) == 1) {
			return;
		}
		
		int mid = (e+s) /2;
		
		mergeSortInPlaceInPlace(arr, s, mid);
		mergeSortInPlaceInPlace(arr, mid, e);
	
		mergeInPlace(arr,s,mid,e);
	}
	
	private static void mergeInPlace(int[] arr, int s, int mid, int e) {
		int[] mix = new int[e-s];
		
		int i = s;
		int j = mid;
		int k = 0;
		
		while(i<mid && j< e) {
			if(arr[i] < arr[j]) {
				mix[k] = arr[i];
				i++;
			} else {
				mix[k] = arr[j];
				j++;
			}
			k++;
		}
		
		//Here we are checking if something is still left in either of the arrays after the 
		//above addition.
		while(i<mid) {
			mix[k] = arr[i];
			i++;
			k++;
		}
		
		while(j<e) {
			mix[k] = arr[j];
			j++;
			k++;
		}
		
		for(int l=0;l<mix.length;l++) {
			arr[s+l] = mix[l];
		}
		
	}

}
