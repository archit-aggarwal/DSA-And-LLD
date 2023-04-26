package Day16;

import java.util.*;

public class _96FindSum {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // O(n or tests) linear

        int tests = scn.nextInt();
        // while (tests-- > 0) {
        for (int t = 0; t < tests; t++) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            findSum(x, y);
        }
    }

    public static void findSum(int x, int y) {
        System.out.println(x + y);
    }
}
