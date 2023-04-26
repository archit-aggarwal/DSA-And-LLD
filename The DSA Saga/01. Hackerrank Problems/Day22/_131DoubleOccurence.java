package Day22;

import java.util.*;

public class _131DoubleOccurence {
    public static int countFrequency(int[] a2, int target) {
        int count = 0;
        for (int idx = 0; idx < a2.length; idx++) {
            if (a2[idx] == target)
                count++;
        }
        return count;
    }

    public static void printDoubles(int[] a1, int[] a2) {
        for (int idx = 0; idx < a1.length; idx++) {
            int frequency = countFrequency(a2, a1[idx]);
            if (frequency == 2)
                System.out.print(a1[idx] + " ");
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = scn.nextInt();

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++)
            arr2[i] = scn.nextInt();

        printDoubles(arr1, arr2);
    }
}
