// https://practice.geeksforgeeks.org/problems/three-way-partitioning/1
// Time = O(N), Space = O(1)
// Sort 012 Variation

class Solution {
    public void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

    public void threeWayPartition(int arr[], int a, int b) {
        int left = 0, mid = 0, right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] < a) {
                swap(arr, left, mid);
                left++;
                mid++;
            } else if (arr[mid] >= a && arr[mid] <= b) {
                mid++;
            } else {
                swap(arr, right, mid);
                right--;
            }
        }
    }
}
