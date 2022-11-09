import java.util.*;

// leetcode 1636: https://leetcode.com/problems/sort-array-by-increasing-frequency/
// Time = O(N + K), Space = O(N + K)
// Application of Bucket Sort

class Solution {
    @SuppressWarnings("all")
    public int[] frequencySort(int[] nums) {
        int min = -100, max = 100;

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
            for (int c = 0; c < freq[idx]; c++)
                buckets[freq[idx]].add(val);
        }

        // 3. Fill the Sorted Array
        int idx = 0;
        // Increasing Order of Frequency: Left to Right
        for (int count = 1; count < buckets.length; count++) {
            Collections.reverse(buckets[count]);
            // For Same Frequency: Decreasing order: Bottom to Top
            for (Integer val : buckets[count]) {
                nums[idx++] = val;
            }
        }

        return nums;
    }
}