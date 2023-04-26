// https://leetcode.com/problems/powx-n/description/

class Solution {
    public double myPow(double x, int b) {
        if (x == 1)
            return 1;
        if (x == -1) {
            if (b % 2 == 0)
                return 1;
            else
                return -1;
        }

        long n = b;
        if (n < 0) {
            x = 1.0 / x;
            n = n * -1;
        }

        double res = 1;
        for (int idx = 1; idx <= n && res != 0; idx++) {
            res = res * x;
        }
        return res;
    }
}
