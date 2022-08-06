package recursion;

import java.util.ArrayList;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,3,3,4,5,6,7,8};
//		System.out.println(find(arr,8,0));
//		System.out.println(findIndex(arr,8,0));
		findAllIndex(arr,3,0);
//		System.out.println(listt);
//		
//		System.out.println(findIndexRev(arr,8,arr.length-1));
		
		
//		System.out.println(findAllIndexWithListPassed(arr,3,0,new ArrayList<Integer>()));
		
		System.out.println(findAllIndexWithListNotPassed(arr,3,0));
	}
	
	static boolean find(int[] arr,int target,int index) {
		
		if(index == arr.length) {
			return false;
		}
		
		return (arr[index] == target) || find(arr,target,index+1);
		
	}
	
	
	static int findIndex(int[] arr,int target,int index) {
		
		if(index == arr.length) {
			return -1;
		}
		
		if(arr[index] == target) {
			return index;
		}
		
		return findIndex(arr,target,index+1);
	}
	
	static int findIndexRev(int[] arr,int target,int index) {
		
		if(index == -1) {
			return -1;
		}
		
		if(arr[index] == target) {
			return index;
		}
		
		return findIndexRev(arr,target,index-1);
	}
	
	static ArrayList<Integer> listt = new ArrayList<>();
	static void findAllIndex(int[] arr,int target,int index) {
		
		if(index == arr.length) {
			return;
		}
		
		if(arr[index] == target) {
			listt.add(index);
		}
		
		findAllIndex(arr,target,index+1);
	}
	
	static ArrayList<Integer>  findAllIndexWithListPassed(int[] arr,int target,int index,ArrayList<Integer> list) {
		
		if(index == arr.length) {
			return list;
		}
		
		if(arr[index] == target) {
			list.add(index);
		}
		
		return findAllIndexWithListPassed(arr,target,index+1,list); 
	}
	
	static ArrayList<Integer>  findAllIndexWithListNotPassed(int[] arr,int target,int index) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(index == arr.length) {
			return list;
		}
		
		if(arr[index] == target) {
			list.add(index);
		}
		
		ArrayList<Integer> listFromBelow = findAllIndexWithListNotPassed(arr,target,index+1); 
		list.addAll(listFromBelow);
		
		return list;
		
	}



}
