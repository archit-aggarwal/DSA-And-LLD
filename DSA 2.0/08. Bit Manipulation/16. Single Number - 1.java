// https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int val : nums)
            xor = xor ^ val;
        return xor;
    }
}