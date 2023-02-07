// https://leetcode.com/problems/nth-magical-number/description/
// Time = logarithmic, Space = logarithmic

class Solution {
    public long count(long mid, long a, long b, long lcm) {
        return (mid / a) + (mid / b) - (mid / lcm);
    }

    public long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public int nthMagicalNumber(int n, int a, int b) {
        long lcm = (a * b) / gcd(a, b);
        long left = 0, right = Long.MAX_VALUE;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (count(mid, a, b, lcm) < n)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return (int) (left % 1000000007);
    }
}