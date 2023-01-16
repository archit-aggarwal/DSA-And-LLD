// https://leetcode.com/problems/total-hamming-distance/description/

class Solution {
    public int approach1(int[] nums) {
        // Brute Force: O(N ^ 2): TLE
        int sum = 0;
        for (int a : nums) {
            for (int b : nums) {
                sum += Integer.bitCount(a ^ b);
            }
        }

        return sum / 2;
    }

    public int totalHammingDistance(int[] nums) {
        // Optimized: O(N * log N): Accepted
        int sum = 0;

        for (int bit = 0; bit < 32; bit++) {
            int zeros = 0, ones = 0;
            for (int val : nums) {
                if ((val & (1 << bit)) == 0)
                    zeros++;
                else
                    ones++;
            }

            sum = sum + zeros * ones;
        }

        return sum;
    }
}