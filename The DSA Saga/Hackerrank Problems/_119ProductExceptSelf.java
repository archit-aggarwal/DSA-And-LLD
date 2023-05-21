package Day20;

import java.util.*;

public class _119ProductExceptSelf {
    public static void printProducts(int[] arr) {
        long product = 1;

        for (int idx = 0; idx < arr.length; idx++)
            product *= arr[idx];

        for (int idx = 0; idx < arr.length; idx++)
            System.out.println(product / arr[idx]);
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        printProducts(arr);
    }
}
