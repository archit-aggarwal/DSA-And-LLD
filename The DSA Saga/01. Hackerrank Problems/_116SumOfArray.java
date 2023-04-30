package Day20;

import java.util.*;

public class _116SumOfArray {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            sum += arr[idx];
        }
        return sum;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        System.out.println(sumOfArray(arr));
    }
}
