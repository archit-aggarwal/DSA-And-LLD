import java.util.*;
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/

// Time = O(n log k), Space = O(k)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : nums) {
            if (pq.size() < k)
                pq.add(val);
            else if (val > pq.peek()) {
                pq.remove();
                pq.add(val);
            }
        }

        return pq.peek();
    }
}
