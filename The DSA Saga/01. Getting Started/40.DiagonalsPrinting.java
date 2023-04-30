import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(row + col + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(row - col + " ");
            }
            System.out.println();
        }
    }
}