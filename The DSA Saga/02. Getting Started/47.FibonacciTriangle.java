// https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-12-official/ojquestion

import java.util.*;

class Solution47 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int a = 0, b = 1, c = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(a + " ");
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println();
        }
    }
}