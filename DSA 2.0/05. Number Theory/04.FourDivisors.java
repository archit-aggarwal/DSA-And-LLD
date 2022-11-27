// Leetcode 1390: https://leetcode.com/problems/four-divisors/description/

class Solution {
    public int getFactors(int n) {
        int count = 0, sum = 0;
        for (int f = 1; f * f <= n; f++) {
            if (n % f == 0) {
                count++;
                sum += f;
                if (f != n / f) {
                    sum += n / f;
                    count++;
                }
            }
        }

        if (count == 4)
            return sum;
        return 0;
    }

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int val : nums) {
            sum += getFactors(val);
        }
        return sum;
    }
}