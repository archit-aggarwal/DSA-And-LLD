// Leetcode 2215: https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
// Time = O(N1 + N2) Ignoring Sorting
// Space = O(N1 + N2) Output Space

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        int ptr1 = 0, ptr2 = 0;
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] < nums2[ptr2]) {
                int val = nums1[ptr1];
                res.get(0).add(val);
                while (ptr1 < nums1.length && nums1[ptr1] == val)
                    ptr1++;
            } else if (nums1[ptr1] > nums2[ptr2]) {
                int val = nums2[ptr2];
                res.get(1).add(val);
                while (ptr2 < nums2.length && nums2[ptr2] == val)
                    ptr2++;
            } else {
                int val = nums1[ptr1];
                while (ptr1 < nums1.length && nums1[ptr1] == val)
                    ptr1++;
                while (ptr2 < nums2.length && nums2[ptr2] == val)
                    ptr2++;
            }
        }

        while (ptr1 < nums1.length) {
            int val = nums1[ptr1];
            res.get(0).add(val);
            while (ptr1 < nums1.length && nums1[ptr1] == val)
                ptr1++;
        }

        while (ptr2 < nums2.length) {
            int val = nums2[ptr2];
            res.get(1).add(val);
            while (ptr2 < nums2.length && nums2[ptr2] == val)
                ptr2++;
        }

        return res;
    }
}