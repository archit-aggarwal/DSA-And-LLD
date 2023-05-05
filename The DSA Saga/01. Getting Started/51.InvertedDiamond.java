// https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-6-official/ojquestion


import java.util.*;

class Solution51 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = n / 2, spaces = 1;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= stars; count++) {
                System.out.print("*");
            }
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= stars; count++) {
                System.out.print("*");
            }
            System.out.println();
            if (row <= n / 2) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
        }
    }
}