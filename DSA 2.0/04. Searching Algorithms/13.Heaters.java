import java.util.*;

// https://leetcode.com/problems/heaters/description/
// Time = O(N log N), Space = O(1)

class Solution {
    public int lowerBound(int[] nums, int target) {
        // Same as First Occurence
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left; // if target -> first occ, else ceil
    }

    public int findClosest(int arr[], int target) {
        int lb = lowerBound(arr, target);

        if (lb == 0)
            return arr[lb]; // floor does not exist
        if (lb == arr.length)
            return arr[lb - 1]; // ceil does not exist

        if (arr[lb] - target <= target - arr[lb - 1])
            return arr[lb];
        else
            return arr[lb - 1];
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int minRadius = 0;

        for (int val : houses) {
            int closestHeater = findClosest(heaters, val);
            int radius = Math.abs(closestHeater - val);
            minRadius = Math.max(radius, minRadius);
        }

        return minRadius;
    }
}