import java.util.*;
// LC 347: https://leetcode.com/problems/top-k-frequent-elements/description/
// Time = O(N + Range), Space = O(N + Range)

class Solution {
    @SuppressWarnings("all")
    public int[] topKFrequent(int[] nums, int k) {
        int min = -10000, max = 10000;

        int[] freq = new int[max - min + 1];
        // 1. Fill the Frequency Array
        for (int val : nums)
            freq[val - min]++;

        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int idx = 0; idx < buckets.length; idx++)
            buckets[idx] = new ArrayList<>();

        // 2. Fill the Buckets Array
        for (int idx = 0; idx < freq.length; idx++) {
            int val = idx + min;
            buckets[freq[idx]].add(val);
        }

        int[] res = new int[k];
        int idx = 0;

        // 3. Form the Resultant Array (K Most Frequent Elements)
        for (int b = buckets.length - 1; b > 0; b--) {
            for (Integer val : buckets[b]) {
                res[idx++] = val;
                if (idx == k)
                    return res;
            }
        }
        return res;
    }
}