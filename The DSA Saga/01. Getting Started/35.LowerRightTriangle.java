
// https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/gkstr20-pattern-5
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

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