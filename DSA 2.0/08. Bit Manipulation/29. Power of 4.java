// https://leetcode.com/problems/power-of-four/description/

class Solution {
    public boolean isPowerOfFour(int n) {
        int setbits = 0;
        for (int bit = 0; bit < 32; bit++) {
            if ((n & (1 << bit)) != 0) {
                setbits++;
                if ((bit & 1) == 1)
                    return false;
                // set bit should not be at odd index
            }
        }
        return (setbits == 1);
        // power of 4 should be power of 2
    }

    // Approach 2
    // return ((n & (n - 1)) == 0) && (n % 3 == 1);
}