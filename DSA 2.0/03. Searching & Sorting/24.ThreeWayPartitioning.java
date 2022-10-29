// No Question Found Without Relative Order
// Time = O(N), Space = O(1)

class Solution {
    public void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

    public void threeWayPartition(int arr[], int pivot) {
        int left = 0, mid = 0, right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] < pivot) {
                swap(arr, left, mid);
                left++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                swap(arr, right, mid);
                right--;
            }
        }
    }
}
