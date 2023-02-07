// TIme = O(linear), Space = O(logarithmic)
// https://practice.geeksforgeeks.org/problems/ncr-mod-m-part-10038/1

class Solution {
    public long power(long x, long n, long m) {
        if (n == 0)
            return 1;
        if (n % 2 == 1) {
            long ans = power(x, n - 1, m);
            return ((ans * x) % m);
        }

        long ans = power(x, n / 2, m);
        return ((ans * ans) % m);
    }

    public long fact(long a, long m) {
        long ans = 1;
        for (long f = 1; f <= a; f++) {
            ans = (ans * f) % m;
        }
        return ans % m;
    }

    public int nCr(long n, long r) {
        long m = 1000003;
        long num = fact(n, m);
        long d1 = fact(n - r, m);
        long d2 = fact(r, m);

        long den = (d1 * d2) % m;
        long mmi = power(den, m - 2, m);

        return (int) ((num % m * mmi % m) % m);
    }
}