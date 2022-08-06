package linearSearch;

public class LinearSearch {

	
	public static void main(String[] args) {
		int[] arr = {1,25,64,2,56,6,2,1,7};
		int target = 7;
		
		int res = getLinearSearch(arr,target);
		System.out.println(res);
		
		
	}
	
	static int getLinearSearch(int[] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}

	
}

