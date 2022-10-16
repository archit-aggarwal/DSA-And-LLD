// Leetcode 350: https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
// Time: O(N1 + N2), Space = O(N1 + N2) Extra Space

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> common = new ArrayList<>();
        int ptr1 = 0, ptr2 = 0;

        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] < nums2[ptr2]) {
                ptr1++;
            } else if (nums1[ptr1] > nums2[ptr2]) {
                ptr2++;
            } else {
                int val = nums1[ptr1];

                while (ptr1 < nums1.length && nums1[ptr1] == val
                        && ptr2 < nums2.length && nums2[ptr2] == val) {
                    common.add(val);
                    ptr1++;
                    ptr2++;
                }
                while (ptr1 < nums1.length && nums1[ptr1] == val) {
                    ptr1++;
                }
                while (ptr2 < nums2.length && nums2[ptr2] == val) {
                    ptr2++;
                }
            }
        }

        int[] res = new int[common.size()];
        for (int idx = 0; idx < res.length; idx++) {
            res[idx] = common.get(idx);
        }
        return res;
    }
}