// https://pepcoding.com/resources/online-java-foundation/patterns/design-pattern-15-official/ojquestion

import java.util.*;

class Solution54 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1, spaces = n / 2;

        for (int row = 1; row <= n; row++) {

            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            int val = row;
            if (row > n / 2 + 1) {
                val = n - row + 1;
            }

            for (int count = 1; count <= stars; count++) {
                System.out.print(val);
                if (count <= stars / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            System.out.println();
            if (row <= n / 2) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }

        scn.close();
    }
}