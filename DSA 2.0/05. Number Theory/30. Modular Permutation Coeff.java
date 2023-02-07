// https://www.codingninjas.com/codestudio/problems/permutationcoefficient_1214975?leftPanelTab=0
// Time = O(linear), Space = O(log)

class Solution {
    public static long power(long x, long n, long m) {
        if (n == 0)
            return 1;
        if (n % 2 == 1) {
            long ans = power(x, n - 1, m);
            return ((ans * x) % m);
        }

        long ans = power(x, n / 2, m);
        return ((ans * ans) % m);
    }

    public static long fact(long a, long m) {
        long ans = 1;
        for (long f = 1; f <= a; f++) {
            ans = (ans * f) % m;
        }
        return ans % m;
    }

    public static int P(int n, int r) {
        long m = 1000000007;
        long num = fact(n, m);
        long den = fact(n - r, m);
        long mmi = power(den, m - 2, m);

        return (int) ((num % m * mmi % m) % m);
    }
}