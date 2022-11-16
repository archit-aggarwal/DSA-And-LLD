// Time = O(Log N), Space = O(1)

// Approach 1:
class Solution1 {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] < nums[n - 1])
            return 0;
        // Array not rotated at all: completely sorted

        int left = 1, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid - 1] > nums[mid])
                return mid;
            if (nums[mid] <= nums[right])
                right = mid - 1; // unrotated part: min in left side
            else
                left = mid + 1; // rotated part: min in right side
        }

        return -1;
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int pi = findMin(nums);
        int lans = binarySearch(nums, 0, pi - 1, target);
        if (lans != -1)
            return lans;

        return binarySearch(nums, pi, nums.length - 1, target);
    }
}

// Approach 2:
class Solution2 {
    public int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[left] <= arr[mid]) {
                // left range is sorted
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            else {
                // right range is sorted
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}