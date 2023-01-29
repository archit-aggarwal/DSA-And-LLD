// https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/

// Time = O(n), Space = O(n)

class Solution {
    public int circular(int n, int k) {
        if (n == 1)
            return 0;
        return (circular(n - 1, k) + k) % n;
    }

    public int findTheWinner(int n, int k) {
        return circular(n, k) + 1;
    }
}
