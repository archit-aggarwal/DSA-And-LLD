// https://www.codingninjas.com/codestudio/problems/modular-exponentiation_1082146?leftPanelTab=1

// Time = O(log N), Space = O(log N) Recursive
class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        if (n == 0)
            return 1;
        if (n % 2 == 1) {
            long ans = modularExponentiation(x, n - 1, m);
            return (int) ((ans * x) % m);
        }

        long ans = modularExponentiation(x, n / 2, m);
        return (int) ((ans * ans) % m);
    }
}
