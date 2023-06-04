package Day08;

import java.util.*;

public class _47PrintOddNto1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // O(n)
        // for (int idx = n; idx >= 1; idx--) {
        // if (idx % 2 == 1)
        // System.out.println(idx);
        // }

        if (n % 2 == 0)
            n--;

        // O(n / 2) = O(n)
        for (int idx = n; idx >= 1; idx -= 2) {
            System.out.println(idx);
        }
    }
}
