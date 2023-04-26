package Day05;
import java.util.*;

public class _24RunnerUp {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b && a > c) {
            // a is maximum
            if (b > c)
                System.out.println(b); // c is minimum
            else
                System.out.println(c); // b is minimum
        } else if (b > c) {
            // b is maximum
            if (a > c)
                System.out.println(a); // c is minimum
            else
                System.out.println(c); // a is minimum
        } else {
            // c is maximum
            if (a > b)
                System.out.println(a); // b is minimum
            else
                System.out.println(b); // a is minimum
        }
    }
}
