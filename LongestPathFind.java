import java.util.LinkedList;
import java.util.Queue;

import loader.LongestPathAbstract;

public class LongestPathFind extends LongestPathAbstract {
	private Queue<Integer>[] adj;
	private int[] shortPath;
	private int maxNode = 0, maxPath = 0;
	Queue<Integer> edgelist = new LinkedList<Integer>();

	public int LongestShortestPath(int[] edgelist) {
		for (int i = 0; i < edgelist.length; i++) {
			if (edgelist[i] > maxNode) {
				maxNode = edgelist[i];
			}
		}
		maxNode += 1;
		adj = new Queue[maxNode];
		for (int i = 0; i < maxNode; i++) {
			adj[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < edgelist.length; i = i + 2) {
			if (adj[edgelist[i]].contains(edgelist[i + 1])==false||adj[edgelist[i + 1]].contains(edgelist[i])==false) {
				adj[edgelist[i]].add(edgelist[i + 1]);
			}
		}
		for (int i = 0; i < maxNode; i++) {
			if (!this.edgelist.contains(i)) {
				bfs(i);
			}
		}
		shortPath = new int[maxNode];
		for (int i = 0; i < shortPath.length; i++) {
			if (shortPath[i] > maxPath)
				maxPath = shortPath[i];
		}
		return maxPath;
	}

	public Iterable<Integer> adj(int i) {
		return adj[i];
	}

	public void bfs(int in) {
		boolean[] marked = new boolean[maxNode];
		int[] distTo = new int[maxNode];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(in);
		marked[in] = true;
		distTo[in] = 0;
		while (!q.isEmpty()) {
			int v = q.remove();
			for (int w : adj(v)) {
				if (!marked[w]) {
					q.add(w);
					marked[w] = true;
					distTo[w] = distTo[v] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {

	}
}
