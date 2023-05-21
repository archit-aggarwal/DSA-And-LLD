package Day20;

import java.util.*;

public class _118MaxOfArray {
    public static int maxValue(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > maximum)
                maximum = arr[idx];
            // OR
            // maximum = Math.max(maximum, arr[idx]);
        }
        return maximum;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        System.out.println(maxValue(arr));
    }
}
