package slidingWindow;

public class LongestSubArraySum_VariableSlidingWindow {

	
	private static int longestSubArraySum(int[] arr,int targetSum) {

		int start = 0,end = 0;
		int maxValue = Integer.MIN_VALUE;
		int tempSum = 0;
		while(end < arr.length) {

			tempSum += arr[end];

			if(tempSum < targetSum) {
				end++;
			} else if(tempSum == targetSum) {
				maxValue = Math.max(maxValue,(end-start+1));
				end++;
			} else if(tempSum > targetSum) {
				while(tempSum > targetSum) {
					tempSum -= arr[start];
					start++;
				}
				end++;
			}
		}

		return maxValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,1,1,2,3,5};
		
		
		System.out.println("The SubArray -> "+longestSubArraySum(arr,5));
	}

}
