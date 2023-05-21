// https://practice.geeksforgeeks.org/problems/sum-of-gp2120/1

// Time: O(N) - Space O(1)

class Solution {
    public long sum_of_gp(long n, long a, long r) {
        long sum = 0, term = a;
        for (long idx = 0; idx < n; idx++) {
            sum += term;
            term *= r;
        }
        return sum;
    }
}