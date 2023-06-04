package Day13;

import java.util.*;

public class _74Pattern2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // O(n) linear
        for (int row = 1; row <= 12; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
