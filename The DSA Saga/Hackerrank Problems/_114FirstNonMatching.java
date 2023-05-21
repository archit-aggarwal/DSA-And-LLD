package Day19;

import java.util.*;

@SuppressWarnings("all")
public class _114FirstNonMatching {
    public static int firstNonMatching(int[] arr1, int[] arr2) {
        for (int idx = 0; idx < arr1.length; idx++) {
            if (arr1[idx] != arr2[idx])
                return idx;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int idx = 0; idx < n; idx++)
            arr1[idx] = scn.nextInt();

        for (int idx = 0; idx < n; idx++)
            arr2[idx] = scn.nextInt();

        System.out.println(firstNonMatching(arr1, arr2));
    }
}
