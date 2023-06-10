// https://leetcode.com/problems/convert-1d-array-into-2d-array/description/

// time = O(n) ; space = O(1);

import java.util.*;

class Solution2 {
    // APPRAOCH : 1
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length)
            return new int[0][0];

        int[][] mat = new int[m][n];

        for (int idx = 0; idx < original.length; idx++) {
            int row = idx / n;
            int col = idx % n;
            mat[row][col] = original[idx];
        }
        return mat;
    }

    // APPROACH : 2
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length)
            return new int[0][0];
        int[][] mat = new int[m][n];

        int idx = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                mat[row][col] = original[idx++];
            }
        }
        return mat;
    }
}