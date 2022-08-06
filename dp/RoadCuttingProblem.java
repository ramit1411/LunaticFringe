package dp;

public class RoadCuttingProblem {

	
	public static int roadCut(int[] length,int[] price,int N,int size) {
		
		int[][] t = new int[size+1][N+1];
		
		for(int i = 0;i <size+1;i++) {
			t[i][0] = 0;
		}
		
		for(int i = 0;i <N+1;i++) {
			t[0][i] = 0;
		}
		
		for(int i = 1;i<size+1;i++) {
			for(int j = 1;j<N+1;j++) {
				if(length[i-1] <= j) {
					t[i][j] = Math.max(price[i-1] + t[i][j-length[i-1]], t[i-1][j]);
				} else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		
		return t[size][N];		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] length = {1,2,3,4,5,6,7,8};
		int[] price = {1,5,8,9,10,17,17,20};
		int N = 8;
		int size = length.length;
		
		System.out.println(roadCut(length,price,N,size));
	}

}
