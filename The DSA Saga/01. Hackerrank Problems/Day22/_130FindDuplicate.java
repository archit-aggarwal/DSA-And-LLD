package Day22;

import java.util.*;

public class _130FindDuplicate {
    public static boolean findDuplicate(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            for (int r = l + 1; r < arr.length; r++) {
                if (arr[l] == arr[r])
                    return true;
            }
        }
        return false;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(findDuplicate(arr));
    }
}
