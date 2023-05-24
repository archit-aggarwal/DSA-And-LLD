// https://leetcode.com/problems/number-of-good-pairs/description/

// Time complexity: O(N^2) Space complexity: O(1)

import java.util.*;

class Solution14 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}