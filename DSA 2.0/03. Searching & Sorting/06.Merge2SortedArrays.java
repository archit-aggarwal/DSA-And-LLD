// Leetcode 88: https://leetcode.com/problems/merge-sorted-array/description/
// Time = O(n1 + n2), Space = O(n1 + n2) extra space
class Solution1 {
    public void merge(int[] nums1, int n1, int[] nums2, int n2) {
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;
        int[] res = new int[n1 + n2];

        while (ptr1 < n1 && ptr2 < n2) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                res[ptr3] = nums1[ptr1];
                ptr1++;
                ptr3++;
            } else {
                res[ptr3] = nums2[ptr2];
                ptr2++;
                ptr3++;
            }
        }

        while (ptr1 < n1) {
            res[ptr3] = nums1[ptr1];
            ptr1++;
            ptr3++;
        }

        while (ptr2 < n2) {
            res[ptr3] = nums2[ptr2];
            ptr2++;
            ptr3++;
        }

        for (int i = 0; i < res.length; i++) {
            nums1[i] = res[i];
        }
    }
}