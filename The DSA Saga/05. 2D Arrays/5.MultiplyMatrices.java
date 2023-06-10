// https://practice.geeksforgeeks.org/problems/multiply-matrices/1

// time = O(n^3) {cubic} ; space = O(1);

import java.util.*;

class Solution5 {
    public static void multiply(int A[][], int B[][], int C[][], int N) {
        int r1 = A.length, c1 = A[0].length;
        int r2 = B.length, c2 = B[0].length;

        if (c1 != r2)
            return; // matrix multiplication not possible

        // resultant dimensions : (r1, c2)

        for (int row = 0; row < r1; row++) {
            for (int col = 0; col < c2; col++) {
                for (int k = 0; k < c1; k++) {
                    C[row][col] += A[row][k] * B[k][col];
                }
            }
        }
    }
}