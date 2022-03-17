package sorting;

public class FindDuplicate {

	//https://leetcode.com/problems/find-the-duplicate-number/submissions/
	//Amazon
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,4,2,2};
		System.out.println(findDup(arr));
		
	}
	
	static int findDup(int[] arr) {
		
		int i = 0;
		
		while(i<arr.length) {
			
			if(arr[i] != i+1) {
				int correct = arr[i] - 1;
				
				if(arr[i] != arr[correct]) {
					arr = swapElements(arr,i,correct);
				} else {
					return arr[i];
				}
			} else {
				i++;
			}
			 
		}
		return -1;
	}
	
    static int[] swapElements(int[] arr,int element1,int element2) {
		int temp = arr[element1];
		arr[element1] = arr[element2];
		arr[element2] = temp;
		
		return arr;
	}
}
