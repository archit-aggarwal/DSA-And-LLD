// https://practice.geeksforgeeks.org/problems/maximum-repeating-number4858/1

// Time complexity: O(N) Space complexity: O(1)

import java.util.*;

class Solution29 {
    int maxRepeating(int[] nums, int n, int k) {
        // visited mark (add n + 1)
        for (int idx = 0; idx < n; idx++) {
            int original = nums[idx] % (n + 1);
            nums[original] += (n + 1);
        }

        // maximum repeating number
        int maxRepeating = 0, maxFreq = 0;
        for (int idx = 0; idx < n; idx++) {
            int freq = nums[idx] / (n + 1);
            if (freq > maxFreq) {
                maxRepeating = idx;
                maxFreq = freq;
            }
        }
        return maxRepeating;
    }
}