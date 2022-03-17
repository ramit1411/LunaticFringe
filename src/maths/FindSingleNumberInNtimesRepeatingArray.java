package maths;

public class FindSingleNumberInNtimesRepeatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,2,3,3,3,4,7,7,7,8,8,8};
		
		int totalBinary = Integer.valueOf(Integer.toBinaryString(arr[0]));
		for(int i = 1;i<arr.length;i++) {
			totalBinary += Integer.valueOf(Integer.toBinaryString(arr[i]));
		}
		System.out.println(totalBinary);
		
		String theActualNum = "";
		while(totalBinary > 0) {
			
			
			//here each number is being %(mod) with the repeating amount of the times number
			theActualNum =  ((totalBinary % 10) % 3)+ theActualNum;
			totalBinary = totalBinary/10;
		}
		
		
		System.out.println(theActualNum); //Bianry
		System.out.println(Integer.parseInt(theActualNum,2));  //Decimal
		
		
	}

}
