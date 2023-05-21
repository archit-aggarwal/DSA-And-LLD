// https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1

// Time complexity: O(log N) Space complexity: O(1)

class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {
        long power = 1;
        while (power < n) {
            power = power * 2;
        }

        if (power == n)
            return true;
        else
            return false;
    }

}