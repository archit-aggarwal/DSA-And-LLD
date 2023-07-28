// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

class Solution8 {
    // time limit exceed ==> O(n^2) ; space = O(1)
    static int compare(long[] arr1, long[] arr2, int l, int r) {
        int n1 = arr1.length;
        long lval = (l < n1) ? arr1[l] : arr2[l - n1];
        long rval = (r < n1) ? arr1[r] : arr2[r - n1];

        if (lval < rval)
            return -1; // swap not required
        else if (lval > rval)
            return +1; // swap required
        else
            return 0; // equal -> swap not required
    }

    static void swap(long[] arr1, long[] arr2, int l, int r) {
        int n1 = arr1.length, n2 = arr2.length;
        if (l < n1 && r < n1) {
            long temp = arr1[l];
            arr1[l] = arr1[r];
            arr1[r] = temp;
        } else if (l < n1 && r >= n1) {
            long temp = arr1[l];
            arr1[l] = arr2[r - n1];
            arr2[r - n1] = temp;
        } else {
            long temp = arr2[l - n1];
            arr2[l - n1] = arr2[r - n1];
            arr2[r - n1] = temp;
        }
    }

    public static void merge(long arr1[], long arr2[], int n1, int n2) {
        for (int i = n1; i < n1 + n2; i++) { // pass
            for (int j = i; j > 0; j--) { // comp
                if (compare(arr1, arr2, j - 1, j) > 0) {
                    swap(arr1, arr2, j - 1, j);
                } else
                    break;

            }
        }
    }
}
