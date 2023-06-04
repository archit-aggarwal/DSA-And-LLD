package Day10;

import java.util.*;

public class _56NthPowerof2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        long res = 1;

        // O(N) Linear
        for (int count = 1; count <= n; count++) {
            res *= 2;
        }

        System.out.println(res);
    }
}
