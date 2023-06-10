// https://leetcode.com/problems/rotate-image/

// time = O(n^2) ; space = O(1);

import java.util.*;

class Solution8 {
    // swap (r1, c1) with (r2, c2) values
    public void swap(int[][] mat, int r1, int c1, int r2, int c2) {
        int temp = mat[r1][c1];
        mat[r1][c1] = mat[r2][c2];
        mat[r2][c2] = temp;
    }

    // rows -> columns, columns -> rows
    public void transpose(int[][] mat, int n) {
        // run loop only in upper right triangle
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                // Swapping values at (row, col) with (col, row)
                swap(mat, row, col, col, row);
            }
        }
    }

    // reverse each row by using two pointer technique
    public void reverseRows(int[][] mat, int n) {
        for (int row = 0; row < n; row++) {
            int left = 0, right = n - 1;
            while (left < right) {
                // swapping values at (row, left) with (row, right)
                swap(mat, row, left, row, right);
                left++;
                right--;
            }
        }
    }

    public void rotate(int[][] mat) {
        int n = mat.length;
        transpose(mat, n);
        reverseRows(mat, n);
    }
}
