package Day18;

import java.util.*;

@SuppressWarnings("all")
public class _109EqualArrays {
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
            
        for (int idx = 0; idx < arr1.length; idx++) {
            if (arr1[idx] != arr2[idx])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr1 = new int[n];

        for (int idx = 0; idx < arr1.length; idx++) {
            arr1[idx] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];

        for (int idx = 0; idx < arr2.length; idx++) {
            arr2[idx] = scn.nextInt();
        }

        boolean res = isEqual(arr1, arr2);
        System.out.println(res);
    }
}
