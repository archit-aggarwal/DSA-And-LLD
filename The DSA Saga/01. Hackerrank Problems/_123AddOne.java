package Day21;

import java.util.*;

public class _123AddOne {
    public static int[] addOne(int[] arr) {
        for (int idx = arr.length - 1; idx >= 0; idx--) {
            if (arr[idx] == 9) {
                arr[idx] = 0;
            } else {
                arr[idx]++;
                return arr;
            }
        }

        // All Digits as 9
        int[] res = new int[arr.length + 1];
        res[0] = 1;
        return res;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        int[] res = addOne(arr);
        for (int idx = 0; idx < res.length; idx++) {
            System.out.print(res[idx] + " ");
        }
    }
}
