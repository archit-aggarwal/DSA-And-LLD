package Day14;

import java.util.*;

public class _79LowerRightTriangle {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // Approach 1
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (row + col <= n)
        //             System.out.print(" ");
        //         else
        //             System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Approach 2
        int spaces = n - 1, stars = 1;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= spaces; col++)
                System.out.print(" ");
            for(int col = 1; col <= stars; col++)
                System.out.print("*");
            System.out.println();
            spaces--; stars++;
        }
    }
}
