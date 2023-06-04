// https://leetcode.com/problems/reverse-string/description/

// Time complexity: O(N) Space complexity: O(1)

class Solution11 {
    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public void reverseString(char[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            swap(arr, left, right);
            left++;
            right--;
        }

    }
}