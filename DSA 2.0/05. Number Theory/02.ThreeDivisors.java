// Leetcode 1952: https://leetcode.com/problems/three-divisors/description/

class Solution {
    // O(Log N)
    public boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    // O(Root N)
    public boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;

        for (int factor = 2; factor * factor <= n; factor++) {
            if (n % factor == 0)
                return false;
        }
        return true;
    }

    public boolean isThree(int n) {
        // Number should be perfect square (odd divisors)
        if (isPerfectSquare(n) == false)
            return false;

        // If it is square of prime, then odd divisors = exactly three
        int sqrt = (int) Math.sqrt(n);
        return isPrime(sqrt);
    }
}