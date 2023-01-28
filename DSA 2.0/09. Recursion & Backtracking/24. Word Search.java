// https://leetcode.com/problems/word-search/description/

class Solution {
    // Top, Left, Down, Right
    int[] dx = { -1, 0, +1, 0 };
    int[] dy = { 0, -1, 0, +1 };

    public boolean dfs(char[][] board, String word, int row, int col, int idx) {
        if (idx == word.length())
            return true; // Entire Word Search Successfully
        if (row >= board.length || col >= board[0].length || row < 0 || col < 0)
            return false; // Out of Matrix
        if (board[row][col] != word.charAt(idx))
            return false; // Not Matching

        for (int i = 0; i < 4; i++) {
            char ch = board[row][col];
            board[row][col] = '#';
            if (dfs(board, word, row + dx[i], col + dy[i], idx + 1) == true)
                return true;
            board[row][col] = ch; // backtracking
        }

        return false;
    }

    public boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, word, r, c, 0) == true)
                    return true;
            }
        }
        return false;
    }
}