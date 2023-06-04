package Day20;

import java.util.*;

public class _117CountEven {
    public static int countEven(int[] arr) {
        int even = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] % 2 == 0)
                even++;
        }
        return even;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        System.out.println(countEven(arr));
    }
}
