package binarySearch;

import java.util.Arrays;

public class TwoDSortedMatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int target = 10;
		System.out.println(Arrays.toString(twoDBinarySearch(arr, target)));
	}
	
	//Searching in the row provided between the columns provided
	static int[] binarySearchInMatrix(int[][] arr, 
										int row, 
										int cStart, 
										int cEnd, 
										int target) {
		
		while(cStart <= cEnd) {
			int mid = cStart + (cEnd-cStart)/2;
			
			if(arr[row][mid] == target) {
				return new int[] {row,mid};
			}
			
			if(arr[row][mid] > target) {
				cEnd = mid - 1;
			} else {
				cStart = mid + 1;
			}  
		}
		
		return new int[] {-1,-1};	
	}
	
	
	static int[] twoDBinarySearch(int[][] arr, int target) {
		
		int rows = arr.length;
		int cols = arr[0].length ; //matrix maybe empty

		if(rows == 1) {
			return binarySearchInMatrix(arr,0,0,cols-1,target);
		}
		
		//run the loop until two rows are remaining
		int rowStart = 0;
		int rowEnd = rows - 1;
		int columnMid = cols/2;
				
		while(rowStart < (rowEnd - 1)) { //while this is true, it will be having more than two rows.
			
			int mid = rowStart + ((rowEnd-rowStart)/2);
			
			if(arr[mid][columnMid] == target) {
				return new int[] {mid,columnMid};
			}
		
			if(arr[mid][columnMid] < target) {
				rowStart = mid;
			} else {
				rowEnd = mid;
			}	
		}
		
		//now we have two rows
		//check whether the target is in the column of 2 rows.
		
		if(arr[rowStart][columnMid] == target) {
			return new int[] {rowStart,columnMid};
		}
		
		if(arr[rowStart + 1][columnMid] == target) {
			return new int[] {rowStart + 1,columnMid};
		}
		
		//search in 1st half
		if(arr[rowStart][columnMid-1] <= target && target <= arr[rowStart][0]) {
			return binarySearchInMatrix(arr,rowStart,0,columnMid-1,target);
		}
		
		//search in 2nd half
		if(arr[rowStart][columnMid+1] >= target && target <= arr[rowStart][cols-1]) {
			return binarySearchInMatrix(arr,rowStart,columnMid+1,cols-1,target);
		}
		
		//search in 3rd half
		if(arr[rowStart+1][columnMid-1] <= target) {
			return binarySearchInMatrix(arr,rowStart+1,0,columnMid-1,target);
		}
		
		//search in 4th half
		if(arr[rowStart+1][columnMid+1] >= target) {
			return binarySearchInMatrix(arr,rowStart+1,columnMid+1,cols-1,target);
		}
		
		
		return new int[] {-1,-1};
	}

}
