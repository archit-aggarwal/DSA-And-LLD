// Time = O(log2 N), Space = O(1)
// Floor: https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/0
// Ceil: https://www.codingninjas.com/codestudio/problems/ceiling-in-a-sorted-array_1825401?leftPanelTab=1

class Floor {
    static int findFloor(long nums[], int n, long target) {
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return right;
    }

}

class Ceil {
    public static int ceilingInSortedArray(int n, int target, int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return nums[mid];
            if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        if (left == nums.length)
            return -1;
        return nums[left];
    }
}