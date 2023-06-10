// https://leetcode.com/problems/diagonal-traverse/description/

// time = O(m * n) {quadratic} ; space = O(1);

import java.util.*;

class Solution10 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int idx = 0;

        for (int d = 0; d <= m + n - 2; d++) {
            if (d % 2 == 1) {
                // top right to bottom left
                int row = (d < n) ? 0 : d - n + 1;
                int col = (d < n) ? d : n - 1;

                while (row < m && col >= 0) {
                    res[idx++] = mat[row][col];
                    row++;
                    col--;
                }
            } else {
                // bottom left to right
                int row = (d < m) ? d : m - 1;
                int col = (d < m) ? 0 : d - m + 1;

                while (row >= 0 && col < n) {
                    res[idx++] = mat[row][col];
                    row--;
                    col++;
                }
            }
        }
        return res;
    }
}