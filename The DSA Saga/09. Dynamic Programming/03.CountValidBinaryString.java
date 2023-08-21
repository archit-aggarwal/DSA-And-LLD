// https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1

// time = O(n) ; space = O(n) {array space};

class Solution {
    long countStrings(int n) {
        long[] count0 = new long[n + 1];
        long[] count1 = new long[n + 1];

        count0[1] = 1;
        count1[1] = 1;

        for (int idx = 2; idx <= n; idx++) {
            count0[idx] = ((count0[idx - 1] % 1000000007) + (count1[idx - 1] % 1000000007)) % 1000000007;
            count1[idx] = count0[idx - 1];
        }
        return ((count0[n] % 1000000007) + (count1[n] % 1000000007)) % 1000000007;
    }
}