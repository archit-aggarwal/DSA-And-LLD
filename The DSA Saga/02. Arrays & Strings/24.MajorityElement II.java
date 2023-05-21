// https://leetcode.com/problems/majority-element-ii/description/

// Time complexity: O(N) Space complexity: O(1)

import java.util.*;

class Solution24 {
    public boolean isActualAnswer(int[] nums, int target) {
        int n = nums.length;
        int freq = 0;

        for (int val : nums) {
            if (val == target) {
                freq++;
            }
        }

        if (freq > n / 3)
            return true;
        else
            return false;
    }

    public List<Integer> majorityElement(int[] nums) {
        int majA = Integer.MIN_VALUE, leadA = 0;
        int majB = Integer.MAX_VALUE, leadB = 0;

        for (int val : nums) {
            if (val == majA) {
                leadA++;
            } else if (val == majB) {
                leadB++;
            } else if (leadA == 0) {
                majA = val;
                leadA = 1;
            } else if (leadB == 0) {
                majB = val;
                leadB = 1;
            } else {
                leadA--;
                leadB--;
            }
        }
        List<Integer> answers = new ArrayList<>();
        if (isActualAnswer(nums, majA) == true)
            answers.add(majA);
        if (isActualAnswer(nums, majB) == true)
            answers.add(majB);
        return answers;
    }

}