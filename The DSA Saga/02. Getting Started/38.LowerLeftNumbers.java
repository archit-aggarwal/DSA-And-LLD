// https://www.codingninjas.com/codestudio/problems/give-me-triangle_893275

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int row = 1; row <= n; row++) {
            int val = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
}
