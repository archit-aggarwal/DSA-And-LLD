package Day12;
import java.util.*;

public class _71PrintDigits {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while (n != 0) {
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }
    }
}
