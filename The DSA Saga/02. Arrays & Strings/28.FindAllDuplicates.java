// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.*;

class Solution28 {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        // visited mark
        for (int idx = 0; idx < n; idx++) {
            int original = nums[idx] % (n + 1);
            nums[original - 1] += (n + 1);
        }

        List<Integer> duplicate = new ArrayList<>();

        for (int idx = 0; idx < n; idx++) {
            int freq = nums[idx] / (n + 1);
            if (freq > 1)
                duplicate.add(idx + 1);

        }
        return duplicate;
    }
}