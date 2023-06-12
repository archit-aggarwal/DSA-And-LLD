// time = O(m*n) ; space = O(1);

import java.util.*;

class Solution9 {
    public static int[] main(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        for (int d = 0; d <= m + n - 2; d++) {
            int row = (d < n) ? 0 : d - n + 1;
            int col = (d < n) ? d : n - 1;

            while (row < m && col >= 0) {
                System.out.print(mat[row][col] + " ");
                row++;
                col--;
            }
        }
        return null;
    }
}
