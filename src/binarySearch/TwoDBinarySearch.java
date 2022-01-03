package binarySearch;

import java.util.Arrays;

public class TwoDBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
		};
		
		int target = 51;
		System.out.println(Arrays.toString(twoDBinarySearch(arr, target)));
	}
	
	static int[] twoDBinarySearch(int[][] arr, int target) {
		
		int r = 0;
		int c = arr.length - 1;
		
		while(r<= arr.length - 1 && c >= 0) {
			
			if(arr[r][c] == target) {
				return new int[] {r,c};
			}
		
			if(arr[r][c] < target) {
				r++;
			} else {
				c--;
			}	
		}
		
		return new int[] {-1,-1};
	}

}
