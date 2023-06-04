package Day05;
import java.util.*;

public class _21PrintOldest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // Nested If-Else
        if (a > b) {
            if (a > c)
                System.out.println("A");
            else
                System.out.println("C");
        } else {
            if (b > c)
                System.out.println("B");
            else
                System.out.println("C");
        }

        // If-Else-If Ladder
        // if (a > b && a > c) {
        // System.out.println("A");
        // } else if (b > c) {
        // System.out.println("B");
        // } else {
        // System.out.println("C");
        // }

    }
}