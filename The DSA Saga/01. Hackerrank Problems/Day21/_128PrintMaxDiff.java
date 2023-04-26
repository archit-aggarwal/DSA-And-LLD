package Day21;

import java.util.*;

public class _128PrintMaxDiff {
    public static int maxDiff(int[] arr) {
        int maximum = Integer.MIN_VALUE;

        for (int l = 0; l < arr.length; l++) {
            for (int r = l + 1; r < arr.length; r++) {
                int diff = arr[r] - arr[l];
                if (diff > maximum)
                    maximum = diff;
            }
        }

        return maximum;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(maxDiff(arr));
    }
}
