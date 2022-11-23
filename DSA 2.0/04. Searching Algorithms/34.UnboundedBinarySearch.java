class UnboundedBinarySearch {
    public int search(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid; // successful search
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // unsuccessful search
    }

    public int infiniteSearch(int[] nums, int left, int right, int target) {
        if (nums[left] >= target && target <= nums[right]) {
            return search(nums, target, left, right);
        } else {
            return infiniteSearch(nums, right + 1, 2 * right, target);
        }
    }
    // left in starting is 0, right in starting is 1.
}