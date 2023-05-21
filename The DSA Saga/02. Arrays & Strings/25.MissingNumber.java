// https://leetcode.com/problems/missing-number/description/

// Time: () - Space ()

import java.util.*;

class Solution25 {
    // APPRAOCH : 1
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // visited mark
        for (int idx = 0; idx < n; idx++) {
            int original = nums[idx] % (n + 1);
            if (original < n)
                nums[original] += (n + 1);
        }

        // find missing number
        for (int idx = 0; idx < n; idx++) {
            int freq = nums[idx] / (n + 1);
            if (freq == 0)
                return idx;
        }
        return n;
    }

    // APPRAOCH : 2

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int val : nums) {
            sum -= val;
        }
        return sum;
    }
}