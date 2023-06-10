// https://practice.geeksforgeeks.org/problems/addition-of-two-square-matrices4916/1

// time = O(n^2) ; space = O(1);

import java.util.*;

class Solution4 {
    public void Addition(int[][] m1, int[][] m2) {
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++) {
                m1[row][col] = m1[row][col] + m2[row][col];
            }
        }
    }
}