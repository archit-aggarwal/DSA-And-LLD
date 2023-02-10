// https://practice.geeksforgeeks.org/problems/fibonacci-sum1423/1
// Time = O(log N) can be optimized using matrix expo

class Solution {
    static long fibSum(long n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        long a = 0, b = 1, c = 1;

        for (long i = 2; i < n + 2; i++) {
            a = b;
            b = c;
            c = (a + b) % 1000000007;
        }

        return c - 1;
    }
}