package Day14;
import java.util.*;

public class _84Diamond {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int spaces = n - 1, stars = 1;
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col <= spaces; col++)
                System.out.print(" ");
            for (int col = 1; col <= stars; col++)
                System.out.print("*");

            System.out.println();
            if (row < n) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}
