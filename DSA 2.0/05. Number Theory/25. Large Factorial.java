// https://practice.geeksforgeeks.org/problems/large-factorial4721/1
// Time = O(N), Space = O(N)

class Solution {
    public long[] factorial(long arr[], int n) {
        long[] fact = new long[100006];
        fact[0] = fact[1] = 1;
        for (int f = 2; f < fact.length; f++)
            fact[f] = (fact[f - 1] * f) % 1000000007;

        long[] ans = new long[n];
        for (int i = 0; i < n; i++)
            ans[i] = fact[(int) arr[i]];

        return ans;
    }
}