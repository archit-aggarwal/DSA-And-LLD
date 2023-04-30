package Day10;

import java.util.*;

public class _58PrintNby3 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // logarithmic => O(log n)
        for (int idx = n; idx > 0; idx /= 3) {
            System.out.print(idx + " ");
        }
    }
}
