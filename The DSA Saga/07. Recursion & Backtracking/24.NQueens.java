// https://leetcode.com/problems/n-queens/description/

// time = O(n^n) ; space = O(n);

import java.util.*;

class Solution {
    List<List<String>> ways;

    public void nQueens(boolean[][] chess, int row, int n) {
        if (row == n) {
            addOutput(chess, n); // boolean[][] -> List<String>
            return;
        }

        // choices or recursive call
        for (int col = 0; col < n; col++) {
            if (isQueenSafe(chess, row, col, n) == false)
                continue;

            chess[row][col] = true;
            nQueens(chess, row + 1, n);
            chess[row][col] = false;
        }

    }

    public void addOutput(boolean[][] chess, int n) {
        List<String> output = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            String str = "";
            for (int col = 0; col < n; col++) {
                if (chess[row][col] == true) {
                    str += 'Q';
                } else {
                    str += '.';
                }
            }
            output.add(str);
        }
        ways.add(output);
    }

    public boolean isQueenSafe(boolean[][] chess, int row, int col, int n) {
        // top
        for (int r = row; r >= 0; r--) {
            if (chess[r][col] == true)
                return false; // not safe
        }

        // top left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (chess[r][c] == true)
                return false; // not safe
        }

        // top right
        for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
            if (chess[r][c] == true)
                return false; // not safe
        }

        return true; // safe
    }

    public List<List<String>> solveNQueens(int n) {
        ways = new ArrayList<>();
        boolean[][] chess = new boolean[n][n];
        nQueens(chess, 0, n);
        return ways;
    }
}