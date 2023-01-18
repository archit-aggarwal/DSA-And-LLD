// https://leetcode.com/problems/single-number-ii/description/

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int bit = 0; bit < 32; bit++) {
            int mask = (1 << bit);
            int counter = 0;

            for (int val : nums) {
                if ((val & mask) != 0) {
                    counter++;
                }
            }

            if (counter % 3 != 0)
                res = (res | mask);
        }

        return res;
    }
}