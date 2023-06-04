import java.util.*;
// https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/print-the-pattern-31-3/problem
// OR
// https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-2-official/ojquestion

class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // Approach 1: Increasing Columns
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Approach 2: Grid Based Approach
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (n - row + 1 >= col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Approach 3: Stars & Spaces Approach
        int stars = n, spaces = 0;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= stars; count++) {
                System.out.print("*");
            }
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            System.out.println();
            stars--;
            spaces++;
        }
    }
}