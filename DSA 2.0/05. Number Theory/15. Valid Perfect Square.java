// https://leetcode.com/problems/valid-perfect-square/description/
// Time = O(root N), Space = O(1)

class Solution {
    public int countFactors(int N) {
        int count = 0;
        for (long i = 1; i * i <= N; i++) {
            if (N % i != 0)
                continue;
            count++;
            if (i != N / i)
                count++;
        }

        return count;
    }

    public boolean isPerfectSquare(int N) {
        int count = countFactors(N);
        if (count % 2 == 1)
            return true; // perfect square
        return false;
    }
}