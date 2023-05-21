package Day06;
import java.util.*;

public class _28DivisibleBy34 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n % 3 == 0 && n % 4 == 0) {
            System.out.println("Divisible by 3 and 4");
        } else {
            System.out.println("Not Divisible");
        }

        // OR
        // if (n % 12 == 0) {
        // System.out.println("Divisible by 3 and 4");
        // } else {
        // System.out.println("Not Divisible");
        // }
    }
}
