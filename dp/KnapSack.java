package dp;

import java.util.Arrays;

public class KnapSack {
	
	static int knapSackRecursive(int wt[],int val[],int W,int n) {
		if(n==0 || W==0) {
			return 0;
		}
		
		if(wt[n-1] <= W) {
			return Math.max(val[n-1] + knapSackRecursive(wt,val,W-wt[n-1],n-1), knapSackRecursive(wt,val,W,n-1));
		} else {
			return knapSackRecursive(wt,val,W,n-1);
		}
	}
	
	//TopDown
	
	static int[][] t = new int[1002][102];
	
	static int knapSackMemorization(int wt[],int val[],int W,int n) {
		if(n==0 || W==0) {
			return 0;
		}
		
		if(t[n][W] != -1) {
			return t[n][W];
		}
		
		if(wt[n-1] <= W) {
			return t[n][W] = Math.max(val[n-1] + knapSackMemorization(wt,val,W-wt[n-1],n-1), knapSackMemorization(wt,val,W,n-1));
		} else {
			return t[n][W] = knapSackMemorization(wt,val,W,n-1);
		}
	}	
	
	//Bottom-Up
	static int knapSackTabular(int wt[],int val[],int W,int n) {
		
		int[][] dpTable = new int[n+1][W+1];
		
		
		
		if(n==0 || W==0) {
			return 0;
		}
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<W+1;j++) {
				if(i==0 || j==0) {
					dpTable[i][j] = 0;
				}
			}
		}
		
		
		for(int i = 1;i<n+1;i++) {
			for(int j=1;j<W+1;j++) {
				
				
				if(wt[i-1] <= j) {
					dpTable[i][j] = Math.max(val[i-1] + dpTable[i-1][j - wt[i-1]] ,dpTable[i-1][j]);
				} else {
					dpTable[i][j] = dpTable[i-1][j];
				}
			}
		}
		
		return dpTable[n][W];
	}	
	
	
	public static void main(String[] args) throws Exception {
		
		int[] wt = {1,3,4,5};
		int[] val = {1,4,5,7};
		int W = 7;
		int n = wt.length;
		
//		System.out.println(knapSackRecursive(wt,val,W,n));
		
		for(int[] row : t) {
			Arrays.fill(row, -1);
		}
		
//		System.out.println(knapSackMemorization(wt,val,W,n));
		
		
		System.out.println(knapSackTabular(wt,val,W,n));
	}
	
	
}
