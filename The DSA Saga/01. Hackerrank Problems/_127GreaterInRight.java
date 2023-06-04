package Day21;

import java.util.*;

public class _127GreaterInRight {
    public static void countGreater(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            int count = 0;
            for (int r = l + 1; r < arr.length; r++) {
                if (arr[r] > arr[l])
                    count++;
            }
            arr[l] = count;
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

        countGreater(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
