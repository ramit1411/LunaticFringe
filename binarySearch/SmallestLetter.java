package binarySearch;

public class SmallestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length - 1;
        int mid;
        while(start<=end) {
                  
            mid = start + ((end-start)/2);
            
            if(letters[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        
        return letters[(start%letters.length)];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr = {'c','f','j'};
		char target = 'c';
		
		char pos = nextGreatestLetter(arr, target);
		
		System.out.println(pos);
	}

}
