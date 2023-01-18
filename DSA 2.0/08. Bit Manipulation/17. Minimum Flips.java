// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
// Time = O(log N), Space = O(1)

class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}