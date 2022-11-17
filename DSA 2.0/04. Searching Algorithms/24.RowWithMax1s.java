// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1

// Time = Avg O(N) Similar to Stepcase, Worst O(N * log N) BS on each row
// Space = O(1)

class Solution {
    int binarySearch(int arr[][], int row, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[row][mid] == 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    int rowWithMax1s(int arr[][], int rows, int cols) {
        int right = cols - 1, ans = -1;

        for (int row = 0; row < rows; row++) {
            int mid = binarySearch(arr, row, 0, right);
            if (mid <= right) {
                ans = row;
                right = mid - 1;
            }
        }

        return ans;
    }
}