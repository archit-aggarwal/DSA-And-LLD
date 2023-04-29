// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n != 0) {
            int digit = n % 10;
            product *= digit; // product = product * digit
            sum += digit; // sum = sum + digit
            n /= 10;
        }

        return (product - sum);
    }
}