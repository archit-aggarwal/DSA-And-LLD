// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/description/

import java.util.*;

class Solution20 {
    public int minStartValue(int[] nums) {
        int sum = 1, starting = 1;

        for (int val : nums) {
            sum += val;
            if (sum <= 0) {
                starting += (1 - sum);
                sum = 1;
            }

        }
        return starting;
    }
}