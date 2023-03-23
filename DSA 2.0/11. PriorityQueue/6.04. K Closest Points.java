import java.util.*;
// https://leetcode.com/problems/k-closest-points-to-origin/description/
// Time = O(N * log N), Space = O(N) Priority Queue

class Solution {
    public static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Euclidean implements Comparator<Pair> {
        @Override
        public int compare(Pair p, Pair q) {
            double d1 = Math.sqrt(p.x * p.x + p.y * p.y);
            double d2 = Math.sqrt(q.x * q.x + q.y * q.y);

            if (d1 < d2)
                return -1;
            else if (d1 > d2)
                return +1;
            else
                return 0;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Euclidean());

        for (int[] point : points) {
            pq.add(new Pair(point[0], point[1]));
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            Pair point = pq.remove();
            res[i][0] = point.x;
            res[i][1] = point.y;
        }

        return res;
    }
}