import java.util.*;
// https://leetcode.com/problems/merge-intervals/description/

// Approach 1: Using Comparator
// Time = O(N * Log N), Space = O(N)
class Solution1 {
    public static class Pair {
        int start, end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // if(p.start < q.start) return -1;
    // else if(p.start > q.start) return +1;
    // else return 0;
    public static class StartingComp implements Comparator<Pair> {
        public int compare(Pair p, Pair q) {
            return p.start - q.start; // min heap
        }
    }

    public int[][] merge(int[][] intervals) {
        ArrayList<Pair> q = new ArrayList<>();
        for (int[] interval : intervals) {
            q.add(new Pair(interval[0], interval[1]));
        }
        Collections.sort(q, new StartingComp());

        ArrayList<Pair> merged = new ArrayList<>();
        merged.add(q.get(0));

        for (Pair curr : q) {
            Pair last = merged.get(merged.size() - 1);

            if (last.end >= curr.start) {
                // merge
                last.end = Math.max(last.end, curr.end);
            } else {
                merged.add(curr);
            }
        }

        int[][] res = new int[merged.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = merged.get(i).start;
            res[i][1] = merged.get(i).end;
        }
        return res;
    }
}

// Approach 2: Using Lambda Expression
// Time = O(N * Log N), Space = O(N)
class Solution2 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (p, q) -> p[0] - q[0]);

        ArrayList<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int[] curr : intervals) {
            int[] last = merged.get(merged.size() - 1);

            if (last[1] >= curr[0]) {
                // overlapping -> merge
                last[1] = Math.max(last[1], curr[1]);
            } else {
                merged.add(curr);
            }
        }

        int[][] res = new int[merged.size()][2];
        for (int i = 0; i < res.length; i++)
            res[i] = merged.get(i);
        return res;
    }
}

// Approach 3

class Solution {
    static class Pair implements Comparable<Pair> {
        int start, end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Pair other) {
            if (this.start < other.start)
                return -1;
            else if (this.start > other.start)
                return +1;
            return 0;
        }
    }

    public int[][] merge(int[][] intervals) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int[] interval : intervals)
            pq.add(new Pair(interval[0], interval[1]));

        List<Pair> res = new ArrayList<>();
        while (pq.size() > 0) {
            Pair curr = pq.remove();
            Pair last = (res.size() == 0) ? null
                    : res.get(res.size() - 1);

            if (last == null || last.end < curr.start)
                res.add(curr);
            else
                last.end = Math.max(last.end, curr.end);
        }

        int[][] mat = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            mat[i][0] = res.get(i).start;
            mat[i][1] = res.get(i).end;
        }
        return mat;
    }
}