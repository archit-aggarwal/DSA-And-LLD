// https://leetcode.com/problems/find-the-duplicate-number/description/

// Time complexity: O(N) Space complexity: O(1)

import java.util.*;

class Solution26 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        // visited mark
        for (int idx = 0; idx < n; idx++) {
            int original = nums[idx] % (n + 1);
            nums[original] += (n + 1);
        }

        // find the repeating or duplicate
        for (int idx = 0; idx < n; idx++) {
            int freq = nums[idx] / (n + 1);
            if (freq > 1)
                return idx;
        }
        return n;
    }
}