import java.util.*;
import java.io.*;

// time = O(log2N), Space = O(1)
// https://www.pepcoding.com/resources/online-java-foundation/leetcode/search-in-nearly-sorted-array/ojquestion
// Article GfG: https://www.geeksforgeeks.org/search-almost-sorted-array/

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solve(num, k));
    }

    public static int solve(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int lval = (mid == 0) ? Integer.MIN_VALUE : arr[mid - 1];
            int rval = (mid == arr.length - 1) ? Integer.MAX_VALUE : arr[mid + 1];

            if (arr[mid] == target)
                return mid;
            if (lval == target)
                return mid - 1;
            if (rval == target)
                return mid + 1;

            int min = Math.min(arr[mid], Math.min(rval, lval));
            int max = Math.max(arr[mid], Math.max(rval, lval));

            if (target < min)
                right = mid - 2;
            else if (target > max)
                left = mid + 2;
            else
                break;
        }
        return -1;
    }
}