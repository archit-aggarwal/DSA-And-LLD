// https://leetcode.com/problems/unique-paths-iii/description/

// time = O(4^n*m) i.e exponential ; space = O(n * m);

import java.util.*;

class Solution16 {
    int startRow = -1, startCol = -1;
    int endRow = -1, endCol = -1;

    public int countPaths(int[][] mat, int row, int col, int freeCells) {
        if (row < 0 || col < 0 || row == mat.length || col == mat[0].length) {
            // index out of bound -> negative base case
            return 0;
        }
        if (mat[row][col] == -2 || mat[row][col] == -1) {
            // visited call or blocked cell -> negative base case
            return 0;
        }
        if (row == endRow && col == endCol) {
            // destination -> positive base case
            if (freeCells == 0)
                return 1;
            else
                return 0;
        }

        mat[row][col] = -2; // visited mark

        int paths = 0;
        // top or up
        paths += countPaths(mat, row - 1, col, freeCells - 1);

        // down
        paths += countPaths(mat, row + 1, col, freeCells - 1);

        // left
        paths += countPaths(mat, row, col - 1, freeCells - 1);

        // right
        paths += countPaths(mat, row, col + 1, freeCells - 1);

        mat[row][col] = 0; // unvisited mark (backtracking)
        return paths;

    }

    public int uniquePathsIII(int[][] grid) {
        int freeCells = 1;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 0) {
                    freeCells++;
                } else if (grid[row][col] == 1) {
                    startRow = row;
                    startCol = col;
                } else if (grid[row][col] == 2) {
                    endRow = row;
                    endCol = col;
                }
            }
        }
        return countPaths(grid, startRow, startCol, freeCells);
    }
}