// https://leetcode.com/problems/sudoku-solver/description/
// Time = O(81 ^ 9) Exponential, Space = O(81)

class Solution {
    public boolean isSafe(char[][] board, int row, int col, char ch) {
        // row
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == ch)
                return false;
        }

        // col
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == ch)
                return false;
        }

        // subgrid
        int tr = (row / 3) * 3, tc = (col / 3) * 3;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r + tr][c + tc] == ch)
                    return false;
            }
        }

        return true;
    }

    public boolean solve(char[][] board, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9)
            return true;
        if (board[row][col] != '.')
            return solve(board, row, col + 1);

        for (char ch = '1'; ch <= '9'; ch++) {
            if (isSafe(board, row, col, ch) == false)
                continue;
            board[row][col] = ch;
            if (solve(board, row, col + 1) == true)
                return true;
            board[row][col] = '.';
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}