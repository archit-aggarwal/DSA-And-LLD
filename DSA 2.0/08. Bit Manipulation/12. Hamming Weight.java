// https://leetcode.com/problems/number-of-1-bits/description/

class Solution {
    public int hammingWeight(int n) {
        // Approach 1:
        // return Integer.bitCount(n);

        // Approach 2:
        // int count = 0;
        // for (int bit = 0; bit < 32; bit++) {
        // if ((n & (1 << bit)) != 0)
        // count++;
        // }
        // return count;

        // Approach 3:
        int count = 0;
        while (n != 0) {
            int rsb = n & -n;
            n = n - rsb;
            count++;
        }
        return count;
    }
}