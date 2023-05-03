// https://www.codingninjas.com/codestudio/problems/number-x_893302

import java.util.*;

class Solution45 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        n = 2 * n - 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row - col == 0 || row + col == n + 1) {
                    int left = col, right = n - col + 1;
                    int min = Math.min(left, right);
                    System.out.print(min + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
