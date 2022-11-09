// LC 169: https://leetcode.com/problems/majority-element/
// Time: O(N), Space: O(1) Constant Extra Space

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], lead = 0;

        for (int idx = 0; idx < nums.length; idx++) {
            int val = nums[idx];

            if (val == majority) {
                lead++;
            } else if (lead == 0) {
                majority = val;
                lead = 1;
            } else {
                lead--;
            }
        }

        return majority;
    }
}