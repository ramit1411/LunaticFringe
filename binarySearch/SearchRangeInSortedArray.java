package binarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class SearchRangeInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        
        int[] arr = {-1,-1};
        
        arr[0] = getElement( nums,  target, true);
        if(arr[0] != -1) {
            arr[1] = getElement( nums,  target, false);
        }
        
        return arr;
    }
    
    public static int getElement(int[] nums, int target, Boolean startEle) {
        
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end) {

            int mid = start + (end-start)/2; 
            
            if(nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                
                if(startEle) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return ans;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,7,7,7,8,8,10};
		
		int target = 7;
		
		System.out.println(Arrays.toString(searchRange(arr,target)));
	}

}
