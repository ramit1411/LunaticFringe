package stackAndQueues;

import java.util.Stack;

public class CelebrityProblem {

	
	public static int findCelebrity(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0;i<arr.length;i++) {
			st.push(i);
		}
		
		while(st.size() >= 2) {
			int i =st.pop();
			int j = st.pop();
			
			if(arr[i][j] == 1) {
				st.push(j);
			} else {
				st.push(i);
			}
		}
		
		int potCeleb = st.pop();
		
		for(int i = 0;i<arr.length;i++) {
			if(i!=potCeleb) {
				if(arr[i][potCeleb] == 0 || arr[potCeleb][i] == 1) {
					return -1;
				}
			}
		}
		
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,1,0},
		               {0,0,0},
		               {0,1,0}};
		
		System.out.println(" celeb -> "+findCelebrity(arr));
  } 
}