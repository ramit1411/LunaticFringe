package dp;

public class MinimumCoins {

	
	public static int getMinNoOfCoinsToGetAns(int[] coin,int sum) {
		
		int[][] dpTable = new int[coin.length+1][sum+1];
		
		for(int itr=1;itr<coin.length+1;itr++) {
			dpTable[itr][0] = 0;
		}
		
		for(int itr=0;itr<sum+1;itr++) {
			dpTable[0][itr] = Integer.MAX_VALUE - 1;
		}
		
		for(int itr=1;itr<sum+1;itr++) {
			if(itr%coin[0] == 0) {
				dpTable[1][itr] = 1;
			} else {
				dpTable[1][itr] = Integer.MAX_VALUE - 1;
			}
		}
		
		
		
		for(int row = 1; row < coin.length+1;row++) {
			for(int column = 2; column < sum + 1; column++) {
				if(coin[row-1] <= column) {
					dpTable[row][column] = Math.min(dpTable[row-1][column] , dpTable[row][column-coin[row-1]] + 1);
				} else {
					dpTable[row][column] = dpTable[row-1][column];
				}
			}
		}
		
		return dpTable[coin.length][sum];
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,2,3};
		int sum = 5;
		
		System.out.println(getMinNoOfCoinsToGetAns(coin,sum));
 	}

}
