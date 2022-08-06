package dp;

public class CountNumberOfSubsetWIthGivenDiff {

	public static int subSetSumCount(int[] arr,int sum,int n) {
		int[][] t = new int[n+1][sum+1];
		
		//Initilization
		for(int i=0;i<n+1;i++) {
			t[i][0] = 1;
		}
		
		for(int i=1;i<sum+1;i++) {
			t[0][i] = 0;
		}
		
		//Main Code
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
				} else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		return t[n][sum];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,7};
		
		int[] arr = {1,1,2,3};
		int diff = 1;
		
		//Sum of arr 
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		// s1 + s2 = sum
		// s1 - s2 = diff
		// 2s1 = sum + diff
		// s1 = ((sum + diff)/2);
		
		int count = subSetSumCount(arr,((sum + diff)/2),arr.length);
		
		System.out.println(count);
		
		
	}

}
