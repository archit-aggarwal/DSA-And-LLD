// https://practice.geeksforgeeks.org/problems/modular-multiplicative-inverse-1587115620/1
// Time = O(log(min(a, m))), Space = O(logarithmic)

class Solution {
    int[] gcd(int a, int b) {
        if (b == 0)
            return new int[] { a, 1, 0 }; // gcd, x, y

        int[] ans = gcd(b, a % b);
        long newX = ans[2];
        long newY = ans[1] - ((long) a / b) * ans[2];

        ans[1] = (int) newX;
        ans[2] = (int) newY;
        return ans;
    }

    public int modInverse(int a, int m) {
        int[] ans = gcd(a, m);
        if (m == 1 || ans[0] != 1)
            return -1;
        // if a & m are not co-prime, MMI does not exist
        return (ans[1] % m + m) % m;
    }
}