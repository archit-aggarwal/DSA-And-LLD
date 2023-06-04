package Day04;
import java.util.*;

public class _16AdultOrNot {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Below age");
        }
    }

}
