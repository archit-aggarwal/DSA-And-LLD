// https://leetcode.com/problems/majority-element/description/

// Time complexity: O(N) Space complexity: O(1)

import java.util.*;

class Solution23 {
    public int majorityElement(int[] nums) {
        int majority = 0, lead = 0;

        for (int val : nums) {
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