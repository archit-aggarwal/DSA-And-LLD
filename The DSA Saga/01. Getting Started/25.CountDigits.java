// https://practice.geeksforgeeks.org/problems/count-digits5716/1

// Time complexity: O(log N) Space complexity: O(1)

class Solution {
    static int evenlyDivides(int N) {
        int copy = N, count = 0;

        while (N != 0) {
            int digit = N % 10;
            N /= 10;

            if (digit == 0)
                continue;
            if (copy % digit == 0) {
                count++;
            }
        }

        return count;
    }
}