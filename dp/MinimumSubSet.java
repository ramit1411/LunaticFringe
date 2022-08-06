package dp;

public class MinimumSubSet {

	
	public static int getMinimumValueFromTwoSubset(int[] arr) {
		int range = 0;
		
		for(int i=0;i<arr.length;i++) {
			range+= arr[i];
		}
		
		int n=arr.length;
		boolean[][] t = new boolean[n+1][range+1];
		
		for(int i=0;i<n+1;i++) {
			t[i][0] = true;
		}
		
		for(int i=1;i<range+1;i++) {
			t[0][i] = false;
		}
		
		for(int i = 1; i<n+1;i++) {
			for(int j = 1;j<range+1;j++) {
				if(arr[i-1]<= j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				} else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<=range/2;i++) {
			if(t[n][i]) {
				min = Math.min(min,(range - (2*i)));	
			}
		}
		
		return min;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,7};
		
		int[] arr = {1,6,11,5};
		
		System.out.println(getMinimumValueFromTwoSubset(arr));
		
		
	}

}
