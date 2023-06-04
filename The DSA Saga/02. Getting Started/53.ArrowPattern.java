// https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-17-official/ojquestion

import java.util.*;

class Solution53 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = 1, spaces = n / 2;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= stars; count++) {
                if (row == n / 2 + 1 || count >= stars / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
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