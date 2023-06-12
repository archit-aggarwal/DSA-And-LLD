// https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1

// time = O(n^2)  ; space = O(1);

import java.util.*;

class Solution7 {

    static void transpose(int mat[][], int n) {
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                // Swapping values at (row, col) with (col, row)
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
}