package Day21;

import java.util.*;

public class _126GreaterThanMe {
    public static int countGreater(int[] arr, int target) {
        int count = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > target)
                count++;
        }
        return count;
    }

    public static void printGreater(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            int ans = countGreater(arr, arr[idx]);
            System.out.print(ans + " ");
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        printGreater(arr);
    }
}
