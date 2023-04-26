package Day19;

import java.util.*;

public class _111LinearSearch {
    public static String linearSearch(int[] arr, int target) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target)
                return "True";
        }
        return "False";
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }

        int target = scn.nextInt();
        System.out.println(linearSearch(arr, target));
    }
}
