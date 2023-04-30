package Day13;

import java.util.*;

public class _78Pattern6 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int val = 5 * col;
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
