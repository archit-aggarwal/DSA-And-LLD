package Day11;

import java.util.*;

public class _60RunningSum {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;

        // O(n) linear
        for (int idx = 1; idx <= n; idx++) {
            int val = scn.nextInt();
            sum += val;
            System.out.print(sum + " ");
        }
    }
}
