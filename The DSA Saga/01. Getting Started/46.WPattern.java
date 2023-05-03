// https://pepcoding.com/resources/online-java-foundation/patterns/design-pattern-20-official/ojquestion

import java.util.*;

class Solution46 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1 || col == n || row > n / 2 && row - col == 0 || row > n / 2 && row + col == n + 1) {
                    System.out.print("*    ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}