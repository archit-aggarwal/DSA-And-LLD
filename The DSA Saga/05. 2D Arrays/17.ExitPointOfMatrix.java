// https://practice.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1

// time = O(n * m) ; space = O(1);

import jav.util.*;

class Solution17 {
    // direction = 0 -> right, 1 -> down, 2 -> left, 3 -> top
    public int[] FindExitPoint(int[][] mat) {
        int row = 0, col = 0, direction = 0;

        while (row >= 0 && col >= 0 && row < mat.length && col < mat[0].length) {
            if (mat[row][col] == 1) {
                mat[row][col] = 0; // set 1 to 0
                direction = (direction + 1) % 4; // rotate the direction
            }

            if (direction == 0) {
                // right
                col++;
            } else if (direction == 1) {
                // down
                row++;
            } else if (direction == 2) {
                // left
                col--;
            } else {
                // top
                row--;
            }
        }
        if (row < 0) {
            // top wall
            return new int[] { row + 1, col };
        } else if (col < 0) {
            // left wall
            return new int[] { row, col + 1 };
        } else if (row == mat.length) {
            // bottom wall
            return new int[] { row - 1, col };
        } else {
            // right wall
            return new int[] { row, col - 1 };
        }

    }
}
