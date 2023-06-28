// https://leetcode.com/problems/search-a-2d-matrix-ii/description/

// time = O(m + n) ; space = O(1);

class Solution16 {
    public boolean searchMatrix(int[][] mat, int target) {
        int row = 0, col = mat[0].length - 1;

        // staircase or stepcase search
        while (row < mat.length && col >= 0) {
            if (mat[row][col] == target) {
                return true; // search successful
            } else if (mat[row][col] < target) {
                row++; // discard row
            } else {
                col--; // discard col
            }

        }
        return false; // search unsuccessful
    }
}