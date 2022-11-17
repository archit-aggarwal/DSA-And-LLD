// Optimized Approach: Divide & Conquer Based 
// Stepcase or Staircase Search
// Time = O(N), Space = O(1)

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length, cols = mat[0].length;
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            if (mat[row][col] == target)
                return true;
            if (mat[row][col] < target)
                row++; // discard the topmost row
            else
                col--; // discard the rightmost column
        }

        return false;
    }
}