import java.util.*;
// https://www.geeksforgeeks.org/program-to-print-multiplication-table-of-a-number/
// OR
// https://pepcoding.com/resources/online-java-foundation/patterns/design-pattern-14-official/ojquestion

class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int idx = 1; idx <= 10; idx++) {
            // System.out.println("4x" + idx + "=" + (4 * idx));
            System.out.println(n + "x" + idx + "=" + (n * idx));
        }

        scn.close();
    }
}