// https://leetcode.com/problems/word-search/description/

// time = O(4^l) ; space = O(l) where l is the length of the string

class Solution26 {
    // {top, bottom, left, right}
    int[] dr = { -1, +1, 0, 0 };
    int[] dc = { 0, 0, -1, +1 };

    public boolean search(char[][] board, String word, int row, int col, int idx) {
        if (idx == word.length())
            return true;

        if (row < 0 || col < 0 || row == board.length || col == board[0].length) {
            // index out of bound
            return false;
        }

        if (board[row][col] != word.charAt(idx)) {
            // character mismatch
            return false;
        }

        for (int d = 0; d < 4; d++) {
            board[row][col] = '#';
            boolean ans = search(board, word, row + dr[d], col + dc[d], idx + 1);
            if (ans == true)
                return true;
            board[row][col] = word.charAt(idx); // backtracking
        }

        return false;
    }

    public boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                boolean ans = search(board, word, r, c, 0);
                if (ans == true)
                    return true;
            }
        }

        return false;
    }
}