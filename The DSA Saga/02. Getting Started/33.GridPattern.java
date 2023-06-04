// https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/pattern-3-nxn-star-rectangle/copy-from/1360641967

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Square Grid
        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Rectangular Grid
        int rows = scn.nextInt();
        int cols = scn.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scn.close();
    }
}