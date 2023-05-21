package Day14;

import java.util.*;

public class _80HollowRectangle {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int cols = scn.nextInt();
        int rows = scn.nextInt();

        // O(rows * cols) quadratic
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || col == 1 || row == rows || col == cols)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
