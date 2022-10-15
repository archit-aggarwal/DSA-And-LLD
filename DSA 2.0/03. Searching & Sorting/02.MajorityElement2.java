// LC 229: https://leetcode.com/problems/majority-element-ii/
// Time: O(N), Space: O(1) Constant Extra Space

import java.util.*;

class Solution {
    public int freq(int[] nums, int target) {
        int count = 0;
        for (int val : nums) {
            if (val == target)
                count++;
        }
        return count;
    }

    public List<Integer> majorityElement(int[] nums) {
        int majority1 = Integer.MIN_VALUE;
        int lead1 = 0;

        int majority2 = Integer.MIN_VALUE;
        int lead2 = 0;

        for (int val : nums) {
            if (val == majority1) {
                lead1++;
            } else if (val == majority2) {
                lead2++;
            } else if (lead1 == 0) {
                majority1 = val;
                lead1 = 1;
            } else if (lead2 == 0) {
                majority2 = val;
                lead2 = 1;
            } else {
                lead1--;
                lead2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (freq(nums, majority1) > nums.length / 3)
            res.add(majority1);
        if (freq(nums, majority2) > nums.length / 3)
            res.add(majority2);
        return res;
    }
}