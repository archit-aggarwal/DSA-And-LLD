import java.util.*;

// https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

class Solution1 {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new ArrayDeque<>();
        q.add(0); // source node

        boolean[] vis = new boolean[V];

        while (q.size() > 0) {
            int src = q.remove();
            if (vis[src] == true)
                continue;

            vis[src] = true;
            ans.add(src);

            for (Integer nbr : adj.get(src))
                q.add(nbr);
        }

        return ans;
    }
}

@SuppressWarnings("all")
class Solution2 {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new ArrayDeque<>();

        boolean[] vis = new boolean[V];

        q.add(0); // source node
        vis[0] = true;

        while (q.size() > 0) {
            int src = q.remove();
            ans.add(src);

            for (Integer nbr : adj.get(src)) {
                if (vis[nbr] == false) {
                    q.add(nbr);
                    vis[nbr] = true;
                }
            }
        }

        return ans;
    }

}