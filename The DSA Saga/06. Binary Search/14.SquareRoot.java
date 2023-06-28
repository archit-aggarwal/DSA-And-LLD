// https://leetcode.com/problems/sqrtx/description/

class Solution14 {
    // time = O(root n) ; space = O(1);
    public int mySqrt(int x) {
        long answer = 0;

        for (long idx = 1; idx <= x; idx++) {
            if (idx * idx <= x) {
                answer = idx;
            } else
                break;
        }
        return (int) answer;
    }

    // method: 2
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
}