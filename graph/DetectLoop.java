package graph;

import java.util.ArrayList;

public class DetectLoop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 6;
//		int e = 8;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		createRequiredGraph(adj,v);
		
		System.out.print("ans = "+detectCycleUniDirection(adj,v));
		
	}
	
	public static boolean detectCycleDirectedgraph(ArrayList<ArrayList<Integer>> adj,int v) {
		boolean[] visited = new boolean[v+1];
		boolean[] recurrsiveStack = new boolean[v+1];
		//Multiple Components
		for(int i = 0;i<=v;i++) {
			if(!visited[i]) {
				if(dfs2(adj,visited,i,recurrsiveStack)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean dfs2(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int vertex,
			boolean[] recurrsiveStack) {
		// TODO Auto-generated method stub
		
		visited[vertex] = true;
		recurrsiveStack[vertex] = true;
		for(int curr : adj.get(vertex)) {
			if(!visited[curr]) {
				if(dfs(adj,visited,curr,vertex)) {
					return true;
				} 
			} else if(recurrsiveStack[vertex]) {
				return true;
			}	
			
		}
		recurrsiveStack[vertex] = false;
		return false;
	}

	
	
	public static boolean detectCycleUniDirection(ArrayList<ArrayList<Integer>> adj,int v) {
		boolean[] visited = new boolean[v+1];
		
		//Multiple Components
		for(int i = 0;i<=v;i++) {
			if(!visited[i]) {
				if(dfs(adj,visited,i,-1)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	private static boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int vertex, int parent) {
		// TODO Auto-generated method stub
		
		visited[vertex] = true;
		
		for(int curr : adj.get(vertex)) {
			if(!visited[curr]) {
				if(dfs(adj,visited,curr,vertex)) {
					return true;
				} 
			} else if(curr != parent) {
				return true;
			}	
			
		}
		return false;
	}

	static void createRequiredGraph(ArrayList<ArrayList<Integer>> adj,int v) {
		for(int i = 0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj,1,2);
		addEdge(adj,1,5);
		addEdge(adj,1,3);
		addEdge(adj,2,5);
		addEdge(adj,5,4);
		addEdge(adj,3,4);
		addEdge(adj,4,6);
		addEdge(adj,5,6);
		
		System.out.print(adj);
	}
	
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int source,int dest) {
		adj.get(source).add(dest);
		adj.get(dest).add(source);
	}
}
