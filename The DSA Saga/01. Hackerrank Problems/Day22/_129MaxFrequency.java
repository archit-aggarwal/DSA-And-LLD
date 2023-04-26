package Day22;

import java.util.*;

public class _129MaxFrequency {
    public static int maxFrequency(int[] arr) {
        int value = 0, frequency = 0;

        for (int l = 0; l < arr.length; l++) {
            int count = 0;
            for (int r = l; r < arr.length; r++) {
                if (arr[r] == arr[l])
                    count++;
            }
            if (count > frequency) {
                frequency = count;
                value = arr[l];
            }
        }

        return value;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(maxFrequency(arr));
    }
}
