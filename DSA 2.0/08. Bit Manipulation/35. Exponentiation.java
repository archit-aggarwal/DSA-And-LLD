// https://leetcode.com/problems/powx-n/description/
// Time = O(log N), Space = O(1)

class Solution1 {
    public double myPow(double base, int power) {
        double ans = 1.0;
        long n = power;

        if (n < 0) {
            base = 1.0 / base;
            n = -n;
        }

        for (int bit = 0; bit < 64; bit++) {
            if ((n & (1l << bit)) != 0) {
                ans = ans * base;
            }
            base = base * base;
        }

        return ans;
    }
}

class Solution2 {
    public double myPow(double base, int power) {
        long n = power;

        if (n < 0) {
            base = 1.0 / base;
            n = -n;
        }

        double ans = 1.0;

        while (n != 0) {
            if ((n & 1) == 1) {
                ans = ans * base;
            }
            base = base * base;
            n = n >> 1;
        }

        return ans;
    }
}