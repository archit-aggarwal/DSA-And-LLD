package Day18;

import java.util.*;

public class _105PrintArray {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < arr.length; idx++)
            arr[idx] = scn.nextInt();

        for (int idx = 0; idx < arr.length; idx++)
            System.out.println(arr[idx]);
    }
}
