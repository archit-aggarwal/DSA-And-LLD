// https://leetcode.com/problems/first-missing-positive/description/

// Time: () - Space ()

import java.util.*;

class Solution30 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // discard the number out of range (< 0 or > n)
        for (int idx = 0; idx < n; idx++) {
            if (nums[idx] < 0 || nums[idx] > n) {
                nums[idx] = 0;
            }
        }

        // visited mark (add n + 1 ) : 1 based indexing
        for (int idx = 0; idx < n; idx++) {
            int original = nums[idx] % (n + 1);
            if (original > 0) {
                nums[original - 1] += (n + 1);
            }
        }

        // smallest missing +ve integer
        for (int idx = 0; idx < n; idx++) {
            int freq = nums[idx] / (n + 1);
            if (freq == 0)
                return (idx + 1);
        }

        return (n + 1);
    }
}