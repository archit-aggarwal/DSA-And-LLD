// https://leetcode.com/problems/valid-sudoku/description/

import java.util.*;

class Solution15 {
    public boolean isRowValid(char[][] board, int row) {
        int[] freq = new int[10];
        for (int col = 0; col < 9; col++) {
            if (board[row][col] == '.')
                continue;
            int val = board[row][col] - '0';
            freq[val]++;
            if (freq[val] > 1)
                return false;
        }
        return true;
    }

    public boolean isColValid(char[][] board, int col) {
        int[] freq = new int[10];
        for (int row = 0; row < 9; row++) {
            if (board[row][col] == '.')
                continue;
            int val = board[row][col] - '0';
            freq[val]++;
            if (freq[val] > 1)
                return false;
        }
        return true;
    }

    public boolean isSubGridValid(char[][] board, int row, int col) {
        int[] freq = new int[10];
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                if (board[r][c] == '.')
                    continue;
                int val = board[r][c] - '0';
                freq[val]++;
                if (freq[val] > 1)
                    return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            if (isRowValid(board, row) == false)
                return false;
        }

        for (int col = 0; col < 9; col++) {
            if (isColValid(board, col) == false)
                return false;
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (isSubGridValid(board, row, col) == false)
                    return false;
            }
        }

        return true;
    }
}