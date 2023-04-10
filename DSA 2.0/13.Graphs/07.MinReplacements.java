import java.util.*;
// https://leetcode.com/problems/number-of-operations-to-make-network-connected/description/

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

    public void dfs(int src, boolean[] vis) {
        if (vis[src] == true)
            return;

        vis[src] = true;
        for (int nbr : adj[src])
            dfs(nbr, vis);
    }
}

class Solution {
    public int makeConnected(int n, int[][] connections) {
        // corner case: not possible
        if (n - 1 > connections.length)
            return -1;

        Graph g = new Graph(n);
        for (int[] edge : connections)
            g.addEdge(edge[0], edge[1]);

        boolean[] vis = new boolean[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == true)
                continue;
            components++;
            g.dfs(i, vis);
        }

        return components - 1;
    }
}