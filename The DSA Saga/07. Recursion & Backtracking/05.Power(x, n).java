// https://leetcode.com/problems/powx-n/

// ACCEPTED
class Solution {
    // time = O(log n) ; space = O(log n);

    public double power(double x, long n) {
        // base case
        if (n == 0)
            return 1.0;

        if (n % 2 == 1) {
            // x^n = x^n-1 * x
            double smallAns = power(x, n - 1);
            double bigAns = smallAns * x;
            return bigAns;
        }

        // x^n = x^n/2 * x^n/2
        double smallAns = power(x, n / 2);
        double bigAns = smallAns * smallAns;
        return bigAns;
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            return power(1 / x, -1l * n);
        }
        return power(x, n);

    }
}

// RUN TIME ERROR (STACK OVERFLOW)
class Solution {
    // time = O(n) ; space = O(n);
    public double power(double x, long n) {
        // base case

        if (n == 0)
            return 1;

        // recursice call / faith

        double smallAns = power(x, n - 1);

        // remaining work

        double bigAns = smallAns * x;
        return (bigAns);
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            return power(1 / x, -1l * n);
        }
        return power(x, n);

    }
}