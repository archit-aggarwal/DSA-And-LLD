package Day13;

import java.util.*;

public class _76Pattern4 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Approach 1
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row >= col)
        // System.out.print("* ");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // Approach 2: O(n ^ 2)
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
