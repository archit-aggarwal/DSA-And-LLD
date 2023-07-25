// https://leetcode.com/problems/merge-sorted-array/description/

// time = O(n1 + n2) ; space = O(1);

class Solution7 {
    public void merge(int[] arr1, int n1, int[] arr2, int n2) {
        int p1 = n1 - 1, p2 = n2 - 1, p3 = n1 + n2 - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (arr1[p1] > arr2[p2]) {
                arr1[p3] = arr1[p1];
                p3--;
                p1--;
            } else {
                arr1[p3] = arr2[p2];
                p3--;
                p2--;
            }
        }
        while (p2 >= 0) {
            arr1[p3] = arr2[p2];
            p3--;
            p2--;
        }

    }
}