package Day19;

import java.util.*;

public class _113LastOccurence {
    // public static int lastOccurence(int[] arr, int target) {
    // for (int idx = arr.length - 1; idx >= 0; idx--) {
    // if (arr[idx] == target)
    // return idx;
    // }
    // return -1;
    // }

    public static int lastOccurence(int[] arr, int target) {
        int answer = -1;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target)
                answer = idx;
        }
        return answer;
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
        System.out.println(lastOccurence(arr, target));
    }
}
