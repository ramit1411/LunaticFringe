package dp;

public class SubSetSum {

	
	public static boolean getSubSetSum(int[] arr,int sum,int n) {
		
		boolean[][] dp = new boolean[n+1][sum+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0) {
					dp[i][j] = true;
				}else if(j==0) {
					dp[i][j] = false;
				}
			}
		}
		
		
		for(int i = 1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(arr[i-1] <= j) {
					dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][sum];
	}
	
	public static boolean checkIfEqualPartsSubSetPossible(int arr[]) {
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		if(sum %2 != 0) {
			return false;
		} else {
			return getSubSetSum(arr,sum/2,arr.length);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,7,8,10};
		int sum = 11;
		int n = arr.length;

		System.out.println(getSubSetSum(arr,sum,n));
		
		
		int[] arr2 = {1,5,11,5};
		
		System.out.println(checkIfEqualPartsSubSetPossible(arr2));
		
	}

}
