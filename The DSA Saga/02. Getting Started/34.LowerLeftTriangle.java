import java.util.*;
// https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/gkstr18-pattern-4/problem
// OR
// https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-1-official/ojquestion

class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // Approach 1: Increasing Columns
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Approach 2: Grid Based Approach
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row >= col)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Approach 3: Stars & Spaces Approach
        int stars = 1, spaces = n - 1;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= stars; count++) {
                System.out.print("* ");
            }
            for (int count = 1; count <= spaces; count++) {
                System.out.print("  ");
            }
            System.out.println();
            stars++;
            spaces--;
        }
    }
}