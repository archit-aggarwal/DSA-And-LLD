// https://leetcode.com/problems/set-matrix-zeroes/description/

import java.util.*;

class Solution13 {

    // time = O(m * n * (m + n)) {cubic} ; space = O(m * n) ;

    // APPROACH : 1
    public int[][] deepCopy(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] copy = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                copy[row][col] = mat[row][col];
            }
        }
        return copy;
    }

    public void setRowZero(int[][] mat, int row) {
        for (int col = 0; col < mat[0].length; col++) {
            mat[row][col] = 0;
        }
    }

    public void setColZero(int[][] mat, int col) {
        for (int row = 0; row < mat.length; row++) {
            mat[row][col] = 0;
        }
    }

    public void setZeroes(int[][] mat) {
        int[][] copy = deepCopy(mat);

        for (int row = 0; row < copy.length; row++) {
            for (int col = 0; col < copy[0].length; col++) {
                if (copy[row][col] == 0) {
                    setRowZero(mat, row);
                    setColZero(mat, col);
                }
            }
        }
    }

    // APPRAOCH : 2

    // time = O(m * n) ; space = O(m + n);

    public void setZeroes(int[][] mat) {
        boolean[] rows = new boolean[mat.length];
        boolean[] cols = new boolean[mat[0].length];

        // Queries -> Store Zeroes
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    rows[row] = cols[col] = true;
                }
            }
        }

        // Updates -> Set Zeroes
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (rows[row] == true || cols[col] == true) {
                    mat[row][col] = 0;
                }
            }
        }
    }

    // APPRAOCH : 3

    // time = O(n^2) ; space = O(1);

    public void setZeroes(int[][] mat) {
        boolean r0Zero = false, c0Zero = false;

        // Queries -> Store Zeroes
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    mat[0][col] = mat[row][0] = 0;
                    if (row == 0)
                        r0Zero = true;
                    if (col == 0)
                        c0Zero = true;
                }
            }
        }

        // Updates -> Set Zeroes
        for (int row = 1; row < mat.length; row++) {
            for (int col = 1; col < mat[0].length; col++) {
                if (mat[row][0] == 0 || mat[0][col] == 0) {
                    mat[row][col] = 0;
                }
            }
        }

        // first Row (r0)
        if (r0Zero == true) {
            for (int col = 0; col < mat[0].length; col++) {
                mat[0][col] = 0;
            }
        }

        // first Col (c0)
        if (c0Zero == true) {
            for (int row = 0; row < mat.length; row++) {
                mat[row][0] = 0;
            }
        }
    }
}
