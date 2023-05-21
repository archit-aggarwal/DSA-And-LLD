// Appraoch 1: Time complexity: O(N^3) Space complexity: O(1)

// Appraoch 2: Time complexity: O(N^2) Space complexity: O(N)

import java.util.*;

class Solution15 {
    public static void main(String[] args) {
        // APPROACH 1 : 3 NESTED LOOPS
        for (int left = 0; left < arr.length; left++) {
            for (int right = 0; right < arr.length; right++) {
                for (int idx = left; idx <= right; idx++) {
                    System.out.println(arr[idx] + " ");
                }
                System.out.println();
            }
        }

        // APPROACH 2 : 2 NESTED LOOPS
        for (int left = 0; left < arr.length; left++) {
            ArrayList<Integer> subarray = new ArrayList<>();
            for (int right = left; right < arr.length; right++) {
                subarray.add(arr[right]);
                System.out.println(subarray);

            }
        }
    }
}