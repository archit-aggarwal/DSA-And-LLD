// Leetcode 74: https://leetcode.com/problems/search-a-2d-matrix/description/

// Approach 1: Brute Force: Binary Search On Each Row
// Time = O(N log N), Space = O(1)
class Solution {
    public boolean binarySearchRow(int[][] mat, int row, int target) {
        int left = 0, right = mat[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mat[row][mid] == target)
                return true;
            else if (mat[row][mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }

    public boolean searchMatrix(int[][] mat, int target) {
        for (int row = 0; row < mat.length; row++) {
            if (binarySearchRow(mat, row, target) == true) {
                return true;
            }
        }
        return false;
    }
}

// Approach 2: Optimized Approach: Binary Search on 1D Array
// Time = O(2 * log N), Space = O(1)

class Solution2 {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length, cols = mat[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols, col = mid % cols;

            if (mat[row][col] == target)
                return true;
            else if (mat[row][col] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}