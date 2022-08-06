package stackAndQueues;

import java.util.Arrays;

//https://youtu.be/FbGG2qpNp4U?list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd
public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,0,0,2,0,4};
		rainWaterHarvest(arr);
	}
	
	static void rainWaterHarvest(int[] arr) {
		int[] rainWater = new int[arr.length];
		int[] mxl = maxValueLeftArray(arr);
		int[] mxr = maxValueRightArray(arr);
		
		int maxTotal = 0;
		for(int i=0;i<arr.length;i++) {
			rainWater[i] = Math.min(mxl[i],mxr[i])-arr[i];
			maxTotal+=rainWater[i];
		}
		
		System.out.println(Arrays.toString(rainWater));
		System.out.println(maxTotal);
	}
	
	static int[] maxValueLeftArray(int[] arr) {
		
		int[] mxl = new int[arr.length];
		mxl[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(mxl[i-1] < arr[i]) {
				mxl[i] = arr[i];
			} else {
				mxl[i] = mxl[i-1];
			}
		}
		return mxl;
	}
	
	static int[] maxValueRightArray(int[] arr) {
		int[] mxr = new int[arr.length];
		mxr[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			if(mxr[i+1] < arr[i]) {
				mxr[i] = arr[i];
			} else {
				mxr[i] = mxr[i+1];
			}
		}
		return mxr;
	}
	
	
	
}




