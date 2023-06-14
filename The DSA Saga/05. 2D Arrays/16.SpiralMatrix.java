// https://leetcode.com/problems/spiral-matrix/description/

// time = O(m * n) ; space = O(1);

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> spiral = new ArrayList<>();
        int fr = 0, fc = 0, lr = mat.length - 1, lc = mat[0].length - 1;

        while (true) {
            // top wall (left to right)
            for (int c = fc; c <= lc; c++) {
                spiral.add(mat[fr][c]);

            }
            fr++;
            if (fr > lr)
                break;

            // right wall (top to bottom)
            for (int r = fr; r <= lr; r++) {
                spiral.add(mat[r][lc]);
            }
            lc--;
            if (fc > lc)
                break;

            // bottom wall (right to left)
            for (int c = lc; c >= fc; c--) {
                spiral.add(mat[lr][c]);
            }
            lr--;
            if (fr > lr)
                break;

            // left wall (bottom to top)
            for (int r = lr; r >= fr; r--) {
                spiral.add(mat[r][fc]);
            }
            fc++;
            if (fc > lc)
                break;
        }

        return spiral;
    }
}