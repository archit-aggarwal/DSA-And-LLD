// https://leetcode.com/problems/valid-perfect-square/description/

class Solution15 {
    public int mySqrt(int x) {
        long left = 0, right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid <= x) {
                // true region
                left = mid + 1;
            } else {
                // false region
                right = mid - 1;
            }
        }

        return (int) right;
    }

    public boolean isPerfectSquare(int num) {
        int sqrt = mySqrt(num);
        return sqrt * sqrt == num;
    }
}