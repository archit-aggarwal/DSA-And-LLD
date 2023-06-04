// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

// Time complexity: O(N) Space complexity: O(1)

import java.util.*;

class Solution27 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // visited mark
        for (int idx = 0; idx < n; idx++) {
            int original = nums[idx] % (n + 1);
            nums[original - 1] += (n + 1);
        }

        // find all missing numbers
        List<Integer> missing = new ArrayList<>();

        for (int idx = 0; idx < n; idx++) {
            int freq = nums[idx] / (n + 1);
            if (freq == 0)
                missing.add(idx + 1);

        }
        return missing;
    }
}