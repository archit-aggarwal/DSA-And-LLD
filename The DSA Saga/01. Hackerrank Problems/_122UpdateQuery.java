package Day20;

import java.util.*;

public class _122UpdateQuery {
    public static void updateArray(int[] arr, int l, int r, int x) {
        for (int idx = l; idx <= r; idx++)
            arr[idx] = x;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        int l = scn.nextInt();
        int r = scn.nextInt();
        int x = scn.nextInt();

        updateArray(arr, l, r, x);
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
    }
}
