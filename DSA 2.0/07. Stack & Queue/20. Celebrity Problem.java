// https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
// Time = O(N), Space = O(1)

class Solution {
    int celebrity(int M[][], int n) {
        int ans = 0;
        for (int idx = 1; idx < n; idx++) {
            if (M[idx][ans] == 0) {
                ans = idx;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == ans)
                continue;
            if (M[ans][i] != 0)
                return -1;
            if (M[i][ans] != 1)
                return -1;
        }

        return ans;
    }
}