import java.util.*;
// https://leetcode.com/problems/find-if-path-exists-in-graph/description/
// Time = O(N + E) DFS
// Space = O(N + E) Adjacency List, O(N) Recursion Stack Space

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

    // unweighted
    public void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src); // undirected
    }

    // DFS
    public boolean hasPath(int src, int dest, boolean[] vis) {
        if (src == dest)
            return true;
        if (vis[src] == true)
            return false;

        vis[src] = true;
        for (int nbr : adj[src]) {
            if (hasPath(nbr, dest, vis) == true)
                return true;
        }
        return false;
    }

    // BFS
    public boolean BFS(int src, int dest) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(src); // source node

        boolean[] vis = new boolean[n];

        while (q.size() > 0) {
            src = q.remove();

            if (src == dest)
                return true;
            if (vis[src] == true)
                continue;
            vis[src] = true;

            for (Integer nbr : adj[src])
                q.add(nbr);
        }

        return false;
    }
}

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g = new Graph(n);
        for (int[] edge : edges)
            g.addEdge(edge[0], edge[1]);

        boolean[] vis = new boolean[n];
        return g.hasPath(source, destination, vis);
    }
}

class Solution3 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g = new Graph(n);
        for (int[] edge : edges)
            g.addEdge(edge[0], edge[1]);

        return g.BFS(source, destination);
    }
}