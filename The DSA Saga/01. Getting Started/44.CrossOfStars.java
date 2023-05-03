// https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-9-official/ojquestion

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row - col == 0 || row + col == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
