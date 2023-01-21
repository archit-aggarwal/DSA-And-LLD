// https://practice.geeksforgeeks.org/problems/game-of-xor1541/1

class Solution {
    static int gameOfXor(int N, int[] A) {
        int res = 0;

        for (int idx = 0; idx < N; idx++) {
            long occurences = (idx + 1l) * (N - idx);
            if ((occurences & 1) == 1) {
                res = res ^ A[idx];
            }
        }

        return res;
    }
}