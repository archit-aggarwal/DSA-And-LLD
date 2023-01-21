// https://leetcode.com/problems/xor-queries-of-a-subarray/description/
// Precomputation: Prefix XOR 
// Total Time = O(N + Q)

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length, q = queries.length;

        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] ^ arr[i];
        }

        int[] res = new int[q];
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            res[i] = pref[r];
            if (l > 0)
                res[i] = res[i] ^ pref[l - 1];
        }
        return res;
    }
}