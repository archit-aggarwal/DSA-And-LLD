package Day15;
import java.util.*;

public class _90AmstrongNo {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        // t
        while (tests-- > 0) {
            int input = scn.nextInt();
            int sum = 0;

            // log n
            for (int idx = input; idx > 0; idx /= 10) {
                int digit = idx % 10;
                int cube = digit * digit * digit;
                sum += cube;
            }

            System.out.println(sum == input);
        }
    }
}
