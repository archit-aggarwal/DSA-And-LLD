// Time complexity: O(N) Space complexity: O(N)

import java.util.*;

class Solution4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] res = getSquareArray(arr);
        for (int idx = 0; idx < res.length; idx++) {
            System.out.print(res[idx] + " ");
        }

    }

    public static int[] getSquareArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int idx = 0; idx < arr.length; idx++) {
            res[idx] = arr[idx] * arr[idx];
        }
        return res;
    }
}