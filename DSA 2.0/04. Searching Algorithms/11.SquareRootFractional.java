// https://www.codingninjas.com/codestudio/problems/square-root-decimal_1095655?leftPanelTab=0
// Find Square Root of N upto D Precision/Decimal Places
// Time = O(logN + 10 * D), Space = O(1)

class Solution {
    public static long mySqrt(long n) {
        long left = 1, right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2l;

            if (mid * mid <= n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static double squareRoot(long n, int d) {
        long floor = mySqrt(n);
        double ans = floor;
        double factor = 1.0;

        for (int i = 0; i < d; i++) {
            factor = factor / 10;
            for (int j = 0; j < 10; j++) {
                if ((ans + factor) * (ans + factor) <= n)
                    ans += factor;
                else
                    break;
            }
        }

        return ans;
    }
}