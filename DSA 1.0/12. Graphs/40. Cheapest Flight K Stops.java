// Leetcode 787: https://leetcode.com/problems/cheapest-flights-within-k-stops/

import java.util.*;

// Dijkstra Variation: Time Limit Exceeded
// Time = O(Exponential) in Worst , O(Polynomial) in Average Case

class Solution1 {
    public static class Pair implements Comparable<Pair> {
        int node;
        int weight;
        int stops;

        public Pair(int node, int weight, int stops) {
            this.node = node;
            this.weight = weight;
            this.stops = stops;
        }

        @Override
        public int compareTo(Pair other) {
            return (this.weight - other.weight);
            // Min Priority Queue -> Negative for this < other
        }
    }

    @SuppressWarnings("unchecked")
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Pair>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();

        for (int[] edge : flights) {
            // edge[0] -> source, edge[1] -> destination, edge[2] -> cost
            adj[edge[0]].add(new Pair(edge[1], edge[2], 0)); // Directed
        }

        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(src, 0, 0));

        while (q.size() > 0) {
            Pair top = q.remove();

            // Shortest Path (Edge Weight) => Cheapest && Within k Stops
            if (top.node == dst && top.stops <= k + 1)
                return top.weight;

            if (top.stops >= k + 1)
                continue;

            for (Pair nbr : adj[top.node]) {
                q.add(new Pair(nbr.node, top.weight + nbr.weight, top.stops + 1));
            }

        }

        return -1;
    }
}

// Bellmon Ford Algorithm: Accepted
// Time = O(K * E) Where K = Number of Stops, E = Number of Edges

class Solution2 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int inf = (int) 1e9;
        int[] dist = new int[n];
        Arrays.fill(dist, inf);
        dist[src] = 0;

        for (int relax = 0; relax <= k; relax++) {
            int[] copy = new int[n];
            for (int i = 0; i < n; i++)
                copy[i] = dist[i];

            for (int[] edge : flights) {
                int out = edge[0];
                int in = edge[1];
                int weight = edge[2];
                if (dist[out] == inf)
                    continue;
                copy[in] = Math.min(copy[in], dist[out] + weight);
            }
            dist = copy;
        }

        if (dist[dst] == inf)
            return -1;
        return dist[dst];
    }
}