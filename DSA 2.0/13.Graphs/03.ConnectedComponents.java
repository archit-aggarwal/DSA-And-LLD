import java.util.*;
// https://leetcode.com/problems/number-of-provinces/description/

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
    public int findCircleNum(int[][] mat) {
        int n = mat.length;
        Graph g = new Graph(n);

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r != c && mat[r][c] == 1)
                    g.addEdge(r, c);
            }
        }

        boolean[] vis = new boolean[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == true)
                continue;
            g.dfs(i, vis);
            components++;
        }

        return components;
    }
}