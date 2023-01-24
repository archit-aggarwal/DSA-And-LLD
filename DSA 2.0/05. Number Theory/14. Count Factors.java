// https://practice.geeksforgeeks.org/problems/number-of-factors1435/1

// Time = O(root N), Space = O(1)
class Solution {
    static int countFactors(int N) {
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
}
