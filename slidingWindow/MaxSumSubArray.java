package slidingWindow;

public class MaxSumSubArray {

	
	private static int getMaxSumSubArray(int[] arr,int windowSize) {
		
		int start = 0,end=0;
		int maxValue = Integer.MIN_VALUE;
		int sum = 0;
		
		while(end<arr.length) {
			
			sum += arr[end];
			
			if((end-start+1) < windowSize) {
				end++;
			} else if((end-start+1) == windowSize) {
				maxValue = Math.max(maxValue, sum);
				sum -= arr[start];
				end++;
				start++;
			}
		}
		
		return maxValue;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,1,8,2,9,1};
		int windowSize = 3;
		
		System.out.println("the max value is - "+ getMaxSumSubArray(arr,windowSize));
	}

}
