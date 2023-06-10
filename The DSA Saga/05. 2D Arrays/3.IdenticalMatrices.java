// https://practice.geeksforgeeks.org/problems/identical-matrices1042/1

// time = O(m*n) or O(n^2) {quadratic} ; space = O(1);

import java.util.*;

class Solution3 {
    int areMatricesIdentical(int N, int[][] m1, int[][] m2) {
        // rows are not same
        if (m1.length != m2.length)
            return 0;

        // cols are not same
        if (m1[0].length != m2[0].length)
            return 0;

        // values comparison
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++) {
                if (m1[row][col] != m2[row][col]) {
                    return 0;
                }
            }
        }
        return 1;

    }
}