// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution11 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            // corner case: completely sorted (not rotated at all)
            return 0;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[0]) {
                // greater region (unrotated)
                left = mid + 1;
            } else {
                // lesser region (rotated)
                right = mid - 1;
            }
        }
        return left;
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                // discard left to mid region
            } else {
                right = mid - 1;
                // discard mid to right region
            }
        }
        return -1; // search unsuccessful
    }

    public int search(int[] nums, int target) {
        int pivot = findMin(nums);

        if (pivot == 0) {
            return binarySearch(nums, target, 0, nums.length - 1);
        } else if (target < nums[0]) {
            return binarySearch(nums, target, pivot, nums.length - 1);
        } else {
            return binarySearch(nums, target, 0, pivot - 1);
        }
    }
}