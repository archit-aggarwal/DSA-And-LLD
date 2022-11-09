import java.util.*;

// Time = O(N + K), Space = O(N + K)
// Stable Sorting Algorithm

class Solution {
    @SuppressWarnings("all")
    public int[] sortArray(int[] nums) {
        int max = 50000, min = -50000; // according to constraint

        // 1. Fill the Buckets Array
        ArrayList<Integer>[] buckets = new ArrayList[max - min + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int val : nums)
            buckets[val - min].add(val);

        // 2. Fill the Result Sorted Array
        int[] res = new int[nums.length];
        int idx = 0;

        for (int actualIdx = 0; actualIdx < buckets.length; actualIdx++) {
            for (Integer val : buckets[actualIdx]) {
                res[idx++] = val;
            }
        }

        return res;
    }
}