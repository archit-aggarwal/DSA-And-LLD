// https://leetcode.com/problems/n-th-tribonacci-number/description/
// Time = O(log N), Space = O(log N)

class Solution {
    public int[][] mult(int[][] m1, int[][] m2) {
        int n = m1.length;
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += m1[i][k] * m2[k][j];

        return res;
    }

    public int[][] power(int[][] m, int n) {
        if (n <= 1)
            return m;
        if (n % 2 == 1)
            return mult(power(m, n - 1), m);

        int[][] res = power(m, n / 2);
        return mult(res, res);
    }

    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int[][] t = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 } };
        t = power(t, n - 1);

        int[][] f1 = { { 1 }, { 1 }, { 2 } };

        int res = 0;
        for (int i = 0; i < 3; i++)
            res += t[0][i] * f1[i][0];

        return res;
    }
}