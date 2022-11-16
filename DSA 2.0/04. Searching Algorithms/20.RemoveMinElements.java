// https://practice.geeksforgeeks.org/problems/remove-minimum-elements4612/1
// Time = O(N Log N), Space = O(1)

import java.util.*;

class Solution {
    public static int upperBound(int[] nums, int target) {
        // Same as Ceil Value
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }

    int minRemoval(int arr[], int n) {
        Arrays.sort(arr);

        int minRemoval = n;

        for (int idx = 0; idx < n; idx++) {
            int leftDel = idx;
            int rightDel = n - upperBound(arr, 2 * arr[idx]);

            minRemoval = Math.min(minRemoval, leftDel + rightDel);
        }

        return minRemoval;
    }
}