// https://leetcode.com/problems/search-a-2d-matrix/description/

// time = O(log(m * n)) ; space = O(1)

class Solution17 {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length, cols = mat[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols, col = mid % cols;

            if (mat[row][col] == target) {
                return true;
            } else if (mat[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}