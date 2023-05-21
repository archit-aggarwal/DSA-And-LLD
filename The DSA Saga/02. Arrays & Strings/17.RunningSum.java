// https://leetcode.com/problems/running-sum-of-1d-array/submissions/952009975/

// Time complexity: O(N) Space complexity: O(N)

import java.util.*;

class Solution17 {
    // APPROACH : 1 (New prefix array)
    public int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int idx = 1; idx < nums.length; idx++) {
            prefix[idx] = nums[idx] + prefix[idx - 1];
        }
        return prefix;
    }

    // APPROACH : 2

    public int[] runningSum(int[] nums) {
        for (int idx = 1; idx < nums.length; idx++) {
            nums[idx] += nums[idx - 1];
        }
        return nums;
    }

    // APPROACH : 3 (USE OF TERNARY OPERATOR)
    public int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];

        for (int idx = 0; idx < nums.length; idx++) {
            prefix[idx] = nums[idx] + ((idx > 0) ? prefix[idx - 1] : 0);

        }
        return prefix;
    }

}
