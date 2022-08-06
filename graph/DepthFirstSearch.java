package graph;

import java.util.ArrayList;

public class DepthFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 6;
//		int e = 8;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		createRequiredGraph(adj,v);
		
		boolean[] visited = new boolean[v+1];
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		ans = dfs(1,adj,visited);
		
		System.out.print("ans = "+ans);
		
	}
	
	static ArrayList<Integer> dfs(int src,ArrayList<ArrayList<Integer>> adj,boolean[] visited) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		visited[src] = true;
		ans.add(src);
		
		for(Integer current : adj.get(src)) {
			if(!visited[current]) {
				ans.addAll(dfs(current,adj,visited));
			}
		}
		
		return ans;
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
