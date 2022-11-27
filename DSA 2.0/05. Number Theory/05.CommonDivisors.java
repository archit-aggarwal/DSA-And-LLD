// https://practice.geeksforgeeks.org/problems/common-divisors4712/1
// Time = O(ROOT N)

class Solution {
    // O(log N)
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // O(root N)
    static long getFactors(long n) {
        long factors = 0;
        for (long f = 1l; f * f <= n; f++) {
            if (n % f == 0) {
                factors++;
                if (f != n / f)
                    factors++;
            }
        }
        return factors;
    }

    static long commDiv(long a, long b) {
        return getFactors(gcd(a, b));
    }
}