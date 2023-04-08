import java.util.*;
//https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/description/

class Graph {
    public int n;
    public ArrayList<Integer>[] adj;

    @SuppressWarnings("all")
    public Graph(int n) {
        this.n = n;
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
    }

    // unweighted, undirected
    public void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public long dfs(int src, boolean[] vis) {
        if (vis[src] == true)
            return 0l;
        long size = 1l;
        vis[src] = true;
        for (int nbr : adj[src])
            size += dfs(nbr, vis);
        return size;
    }
}

class Solution {
    public long countPairs(int n, int[][] edges) {
        Graph g = new Graph(n);
        for (int[] edge : edges)
            g.addEdge(edge[0], edge[1]);

        boolean[] vis = new boolean[n];
        long answer = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == true)
                continue;
            long size = g.dfs(i, vis);
            answer += size * (n - size);
        }
        return answer / 2l;
    }

}