// https://leetcode.com/problems/toeplitz-matrix/description/

// time = O(m * n) ; space = O(1);

import java.util.*;

class Solution11 {
    public boolean isToeplitzMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for(int d = 1 - n; d <=  m - 1; d++){
            int row = (d <= 0) ? 0 : d;
            int col = (d <= 0) ? -d : 0;
            int val = mat[row][col];

            while(row < m && col < n){
                if(mat[row][col] != val) return false;
                row++; col++;
            }
        }
        return true;
    }
}