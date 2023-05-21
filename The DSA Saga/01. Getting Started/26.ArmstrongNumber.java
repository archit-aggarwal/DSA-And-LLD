// https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

// Time complexity: O(log N) Space complexity: O(1)

class Solution {
    static String armstrongNumber(int n) {
        int sum = 0;

        for (int idx = n; idx != 0; idx /= 10) {
            int digit = idx % 10;
            int cube = digit * digit * digit;
            sum += cube;
        }

        if (sum == n)
            return "Yes";
        else
            return "No";
    }
}