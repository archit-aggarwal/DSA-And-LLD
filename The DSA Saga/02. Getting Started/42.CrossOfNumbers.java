import java.util.*;
// https://www.codingninjas.com/codestudio/problems/number-x_893302

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row - col == 0 || row + col == n + 1)
                    System.out.print(row);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
