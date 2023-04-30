package Day22;

import java.util.*;

public class _132TrappingRainWater {
    public static int maxValue(int[] arr, int l, int r) {
        int maximum = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            maximum = Math.max(maximum, arr[i]);
        }
        return maximum;
    }

    public static int trappingWater(int[] arr) {
        int water = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            int leftMax = maxValue(arr, 0, idx);
            int rightMax = maxValue(arr, idx, arr.length - 1);
            water += (Math.min(leftMax, rightMax) - arr[idx]);
        }
        return water;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] height = new int[n];
        for (int idx = 0; idx < n; idx++)
            height[idx] = scn.nextInt();

        int water = trappingWater(height);
        System.out.println(water);
    }
}
