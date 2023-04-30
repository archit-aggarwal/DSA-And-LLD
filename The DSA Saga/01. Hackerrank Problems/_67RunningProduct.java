package Day12;
import java.util.*;

public class _67RunningProduct {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long product = 1;

        while (n > 0) {
            long val = scn.nextLong();
            product *= val;
            System.out.println(product);

            n--;
        }
    }
}
