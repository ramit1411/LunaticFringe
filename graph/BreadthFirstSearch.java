package graph;

import java.util.*;

public class BreadthFirstSearch {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 6;
//		int e = 8;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		createRequiredGraph(adj,v);
		
		int[] prev= new int[v+1];
		int[] dist= new int[v+1];
		
		System.out.println("bfs - "+ bfs(adj,1,6,v,prev,dist));
		System.out.println("prev - "+Arrays.toString(prev));
		System.out.println("dist - "+Arrays.toString(dist));

	}
	
	
	private static boolean bfs(ArrayList<ArrayList<Integer>> adj,
								int src,
								int dest,
								int v,
								int prev[],
								int dist[]) {
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[v+1];
		
		for(int i=0;i<=v;i++) {
			visited[i] = false;
			prev[i] = -1;
			dist[i] = Integer.MAX_VALUE;
		}
		
		visited[src] = true;
		dist[src] = 0;
		queue.add(src);
		
		while(!queue.isEmpty()) {
			int curr = queue.remove();
			
			for(int i=0;i<adj.get(curr).size();i++) {
				int neighbour = adj.get(curr).get(i);
				
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					dist[neighbour] = dist[curr] + 1;
					prev[neighbour] = curr;
					queue.add(neighbour);
					
					if(neighbour == dest) {
						return true;
					}
				}	
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
