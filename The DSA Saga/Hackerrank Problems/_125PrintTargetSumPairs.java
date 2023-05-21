package Day21;

import java.util.*;

public class _125PrintTargetSumPairs {
    public static void printPairs(int[] arr, int sum) {
        // (arr[l], arr[r]) such that l < r && arr[l] + arr[r] = sum
        for (int l = 0; l < arr.length; l++) {
            for (int r = l + 1; r < arr.length; r++) {
                if (arr[l] + arr[r] == sum)
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

        int sum = scn.nextInt();
        printPairs(arr, sum);
    }
}
