import java.util.*;
// https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

class Solution {
    ArrayList<ArrayList<Integer>> adj;
    boolean[] vis;

    public boolean DFS(int src, int par) {
        if (vis[src] == true)
            return true; // loop or cycle

        vis[src] = true;
        for (int nbr : adj.get(src)) {
            if (nbr == par)
                continue;
            if (DFS(nbr, src) == true)
                return true;
        }

        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        this.adj = adj;
        this.vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == false && DFS(i, -1) == true)
                return true;
        }
        return false;
    }
}