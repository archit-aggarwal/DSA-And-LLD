// https://leetcode.com/problems/sudoku-solver/description/

// time = O((n)^(n^2) i.e exponential ; space = O(n^2);

class Solution25 {
    char[][] result;

    public boolean isSafe(char[][] board, int row, int col, char ch){
        // row
        for(int c = 0; c < 9; c++){
            if(board[row][c] == ch) return false;
        }

        // col
        for(int r = 0; r < 9; r++){
            if(board[r][col] == ch) return false;
        }

        // subgrid
        row = (row / 3) * 3; 
        col = (col / 3) * 3;
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                if(board[row + r][col + c] == ch)
                    return false;
            }
        }

        return true;
    }

    public void sudoku(char[][] board, int row, int col){
        if(row == 9) {
            result = new char[9][9];
            for(int r = 0; r < 9; r++){
                for(int c = 0; c < 9; c++){
                    result[r][c] = board[r][c];
                }
            }
            return;
        }

        // cell is already filled 
        if(board[row][col] != '.'){
            sudoku(board, (col < 8) ? row : row + 1, (col < 8) ? col + 1 : 0);
            return;
        }

        // empty cell -> choices 1 to 9
        for(char ch = '1'; ch <= '9'; ch++){
            if(isSafe(board, row, col, ch) == false) continue;

            board[row][col] = ch;
            sudoku(board, (col < 8) ? row : row + 1, (col < 8) ? col + 1 : 0);
            if(result != null) return;
            board[row][col] = '.'; // backtracking
        }
    }

    public void solveSudoku(char[][] board) {
        sudoku(board, 0, 0);
        board = result;
    }
}