package binarySearch;

import java.util.Arrays;

public class TwoDSortedMatrixSearch {

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
	
	static int[] binarySearchInMatrix(int[][] arr, 
										int row, 
										int colL, 
										int colR, 
										int target) {
		
		while(colL < colR) {
			int mid = colL + (colR-colL)/2;
			
			if(arr[row][mid] == target) {
				return new int[] {row,mid};
			}
			
			if(arr[row][mid] > target) {
				colR = mid - 1;
			} else {
				colL = mid + 1;
			}
		}
		
		return new int[] {-1,-1};	
	}
	
	
	static int[] twoDBinarySearch(int[][] arr, int target) {
		
		int rows = arr.length;
		int cols = arr[0].length ;
		int rowSt = 0;
		int rowE = rows - 1;
		int cMid = cols/2;
		
		
				
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
