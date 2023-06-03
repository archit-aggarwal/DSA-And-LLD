// https://leetcode.com/problems/plus-one/description/

import java.util.*;

class Solution4 {
    public int[] plusOne(int[] digits) {
        for (int idx = digits.length - 1; idx >= 0; idx--) {
            if (digits[idx] == 9) {
                digits[idx] = 0;
            } else {
                digits[idx]++;
                return digits;
            }
        }

        // corner case: Input has all digits equal to 9
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}