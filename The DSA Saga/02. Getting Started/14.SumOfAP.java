// https://practice.geeksforgeeks.org/problems/sum-of-ap-series4512/1

// Time: O(N) - Space O(1)

class Solution {
    public long sum_of_ap(long n, long a, long d) {
        long sum = 0;
        for (long idx = 0; idx < n; idx++) {
            sum = sum + (a + idx * d);
        }
        return sum;
    }
}