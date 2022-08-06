package dp;

public class CoinChangeOne_MaxNoOfWays {

	
	public static int getMaxNoOfWayToUseTheCoinsToGetAns(int[] coin,int sum) {
		
		int[][] dpTable = new int[coin.length+1][sum+1];
		
		for(int itr=0;itr<coin.length+1;itr++) {
			dpTable[itr][0] = 1;
		}
		
		for(int itr=0;itr<sum+1;itr++) {
			dpTable[0][itr] = 0;
		}
		
		
		for(int row = 1; row < coin.length+1;row++) {
			for(int column = 1; column < sum + 1; column++) {
				if(coin[row-1] <= column) {
					dpTable[row][column] = dpTable[row-1][column] + dpTable[row][column-coin[row-1]];
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
		
		System.out.println(getMaxNoOfWayToUseTheCoinsToGetAns(coin,sum));
 	}

}
