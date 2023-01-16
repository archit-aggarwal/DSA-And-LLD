// https://leetcode.com/problems/counting-bits/description/

class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        // Approach 1: O(N * log N): Bitmasking
        for (int idx = 0; idx <= n; idx++) {
            res[idx] = Integer.bitCount(idx);
        }

        // Approach 2: O(N): DP With Bitmasking
        for (int idx = 1; idx <= n; idx++) {
            // res[idx] = res[idx / 2] + idx % 2;
            res[idx] = res[(idx >> 1)] + (idx & 1);
        }

        return res;
    }
}

