package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(count(3,3));
//		path("",3,3);
//		System.out.println(pathList("",3,3));
		
//		System.out.println(pathListDiag("",3,3));
		
		
		boolean[][] mazee = {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		
//		pathRestricted("",mazee,0,0);
		
//		allPath("",mazee,0,0);
		
		int[][] path = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		
		allPathPrint("",mazee,0,0,path,1);
	}
	
	static int count(int r,int c) {
		
		if(r==1 || c==1) {
			return 1;
		}
		
		int left = count(r-1,c);
		int right = count(r,c-1);
		
		return left+right;
	}

	static void path(String str, int r,int c) {
		
		if(r==1 && c==1) {
			System.out.println(str);
		}
		
		if(r>1) {
			path(str+'D',r-1,c);
		}
		if(c>1) {
			path(str+'R',r,c-1);
		}
	}
	
	static ArrayList<String> pathList(String str, int r,int c) {
		
		ArrayList<String> lis = new ArrayList<>();
		if(r==1 && c==1) {
			lis.add(str);
			return lis;
		}
		
		if(r>1) {
			lis.addAll(pathList(str+'D',r-1,c));
		}
		if(c>1) {
			lis.addAll(pathList(str+'R',r,c-1));
		}
		
		return lis;
	}
	
	static ArrayList<String> pathListDiag(String str, int r,int c) {
		
		ArrayList<String> lis = new ArrayList<>();
		if(r==1 && c==1) {
			lis.add(str);
			return lis;
		}
		
		if(r>1 && c>1) {
			lis.addAll(pathListDiag(str+'D',r-1,c-1));
		}
		
		if(r>1) {
			lis.addAll(pathListDiag(str+'H',r-1,c));
		}
		if(c>1) {
			lis.addAll(pathListDiag(str+'V',r,c-1));
		}
		
		return lis;
	}
	
	static void pathRestricted(String str,boolean[][] maze, int r,int c) {
		
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(str);
			return;
		}
		
		
		if(!maze[r][c]) {
			return;
		}
		
		
		if(r<maze.length-1) {
			pathRestricted(str+'D',maze,r+1,c);
		}
		if(c<maze[0].length-1) {
			pathRestricted(str+'R',maze,r,c+1);
		}
	}
	
	//Backtracking
	static void allPath(String p,boolean[][] maze, int r,int c) {
		
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		
		if(r<maze.length-1) {
			allPath(p+'D',maze,r+1,c);
		}
		if(c<maze[0].length-1) {
			allPath(p+'R',maze,r,c+1);
		}
		
		if(r>0) {
			allPath(p+'U',maze,r-1,c);
		}
		
		if(c>0) {
			allPath(p+'L',maze,r,c-1);
		}
		
		maze[r][c] = true;
	}
	
	
	//Backtracking & Printing Direction
	static void allPathPrint(String p,boolean[][] maze, int r,int c,int[][] path,int step) {
		
		if(r==maze.length-1 && c==maze[0].length-1) {
			path[r][c] = step;
			
			for(int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c] = false;
		path[r][c] = step;
		
		if(r<maze.length-1) {
			allPathPrint(p+'D',maze,r+1,c,path,step+1);
		}
		if(c<maze[0].length-1) {
			allPathPrint(p+'R',maze,r,c+1,path,step+1);
		}
		
		if(r>0) {
			allPathPrint(p+'U',maze,r-1,c,path,step+1);
		}
		
		if(c>0) {
			allPathPrint(p+'L',maze,r,c-1,path,step+1);
		}
		
		maze[r][c] = true;
		path[r][c] = 0;
	}
}
