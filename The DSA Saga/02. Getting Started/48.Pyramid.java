
// https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/
import java.util.*;

class Solution48 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int spaces = n - 1, stars = 1;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= stars; count++) {
                System.out.print("* ");
            }
            spaces--;
            stars++;
            System.out.println();
        }
    }
}