package graph;

import java.util.ArrayList;

public class AdjacencyLisy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v = 5;
		int e = 10;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		for(int i = 0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
	}
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int source,int dest) {
		adj.get(source).add(dest);
		adj.get(dest).add(source);
	}

}
