package sorting;


//https://leetcode.com/problems/missing-number/
	//Amazon Question
class MissingNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,0,1};
		System.out.println(missingNumber(arr));
		
	}
	
	
    public static int missingNumber(int[] arr) {
        
        int i = 0;
		while(i<arr.length) {
            
            if(arr[i] == arr.length) {
                i++;
                continue;
            }
            
			if(arr[i] != i) {
				arr = swapElements(arr,i,arr[i]);
			} else {
				i++;
			}
		}
        
        for(int j = 0 ;j< arr.length;j++) {
            if(arr[j] != j) {
                return j;
            }
        }
        
        return arr.length;
		
    }
    
    static int[] swapElements(int[] arr,int element1,int element2) {
		int temp = arr[element1];
		arr[element1] = arr[element2];
		arr[element2] = temp;
		
		return arr;
	}
	
}