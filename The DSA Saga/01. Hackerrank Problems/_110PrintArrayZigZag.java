package Day18;

import java.util.*;

@SuppressWarnings("all")
public class _110PrintArrayZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int idx = 0; idx < n; idx++)
            arr1[idx] = scn.nextInt();

        for (int idx = 0; idx < n; idx++)
            arr2[idx] = scn.nextInt();

        for (int idx = 0; idx < n; idx++) {
            if (idx % 2 == 0)
                System.out.println(arr1[idx] + " ");
            else
                System.out.println(arr2[idx] + " ");
        }
    }
}
