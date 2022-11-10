// https://leetcode.com/problems/guess-number-higher-or-lower/
// Time = O(log2 N), Space = O(1)

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int choice = guess(mid);
            if (choice == 0)
                return mid;
            else if (choice == 1)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}

// For No Compilation Errors
class GuessGame {
    public int guess(int val) {
        return 0;
    }
}