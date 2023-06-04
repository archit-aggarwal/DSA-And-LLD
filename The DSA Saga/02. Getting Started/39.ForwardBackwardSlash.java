import java.util.*;
// Forward Slash: https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-7-official/ojquestion

// Backward Slash: https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-8-official/ojquestion

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row - col == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col == n + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}