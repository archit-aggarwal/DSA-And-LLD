package Day18;

import java.util.*;

public class _106PrintAlternateArray {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < arr.length; idx++)
            arr[idx] = scn.nextInt();

        // Approach 1
        for (int idx = 0; idx < arr.length; idx++) {
            if (idx % 2 == 0)
                System.out.println(arr[idx]);
        }

        // Approach 2
        for (int idx = 0; idx < arr.length; idx += 2)
            System.out.println(arr[idx]);
    }
}
