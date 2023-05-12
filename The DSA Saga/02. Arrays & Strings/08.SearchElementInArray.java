// https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1

class Solution8 {

    static int search(int arr[], int N, int target) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                return idx;
            }

        }
        return -1;

    }

}