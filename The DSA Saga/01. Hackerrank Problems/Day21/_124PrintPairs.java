package Day21;

import java.util.*;

public class _124PrintPairs {
    public static void printPairs(int[] arr) {
        // (arr[l], arr[r]) such that l < r

        for (int l = 0; l < arr.length; l++) {
            for (int r = l + 1; r < arr.length; r++) {
                System.out.println(arr[l] + " " + arr[r]);
            }
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        printPairs(arr);
    }
}
