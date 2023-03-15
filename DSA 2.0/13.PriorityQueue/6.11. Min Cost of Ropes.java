import java.util.*;
// https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
// Time = O(N * Log N), Space = O(N) Priority Queue

class Solution {
    long minCost(long arr[], int n) {
        // Min Heap
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long val : arr)
            pq.add(val);

        long cost = 0;
        while (pq.size() > 1) {
            Long left = pq.remove();
            Long right = pq.remove();
            pq.add(left + right);
            cost += left + right;
        }

        return cost;
    }
}