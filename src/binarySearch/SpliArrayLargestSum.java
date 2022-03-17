package binarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/split-array-largest-sum/
public class SpliArrayLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,2,5,10,8};
		int splitVal = 2;
		
		int pos = getSplitArray(arr, splitVal);
		
		System.out.println(pos);
	}
	
	
	static int getMinRange(int[] arr) {
		
		int start = 0;
		int end = arr.length -1 ;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	
	}
	
	static int getMaxRange(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	static int getSplitArray(int[] arr,int splitVal) {
		
		int start = getMinRange(arr);
		int end = getMaxRange(arr);
		System.out.println(start);
		System.out.println(end);
		while(start<end) {
			
			int mid =  start + ((end-start)/2); //This is done because start and end might be big numbers, so it might exceed the integer limit.
			
			int sum = 0;
			int tempSplitVal = 1;
			
			for(int i=0;i<arr.length;i++) {
				if((sum+arr[i]) <= mid) {
					sum += arr[i];
				} else {
					sum = arr[i];
					tempSplitVal++;
				}	
			}
			
			
			if(splitVal >= tempSplitVal) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		
		return start;
	}
	
}
