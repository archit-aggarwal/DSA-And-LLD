// https://leetcode.com/problems/hamming-distance/description/

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}