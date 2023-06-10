// https://leetcode.com/problems/transpose-matrix/

// time = O(n^2) ; space = O(1);

class Solution6 {
    public int[][] transpose(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] res = new int[n][m];

        for (int row = 0; row < res.length; row++) {
            for (int col = 0; col < res[0].length; col++) {
                res[row][col] = mat[col][row];
            }
        }

        return res;

    }
}