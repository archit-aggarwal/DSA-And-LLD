import java.util.*;
// https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/gkstr20-pattern-5
// OR
// https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-3-official/ojquestion

class Solution {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Approach 1: Grid Based Approach
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col > n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Approach 2: Stars & Spaces Approach
        int stars = 1, spaces = n - 1;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= stars; count++) {
                System.out.print("*");
            }
            System.out.println();
            stars++;
            spaces--;
        }
    }
}