// https://leetcode.com/problems/fibonacci-number/description/
// Time = O(Log N), Space = O(log N)

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

    public int fib(int n) {
        if (n <= 1)
            return n;
        int[][] m = { { 1, 1 }, { 1, 0 } };
        m = power(m, n - 1);
        return m[0][0];
    }
}