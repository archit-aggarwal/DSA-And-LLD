// https://leetcode.com/problems/a-number-after-a-double-reversal/

class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0)
            return true;
        else if (num % 10 == 0)
            return false; // trailing zeros
        else
            return true;

        // OR SHORT CODE:
        // return (num == 0 || num % 10 > 0);
    }
}