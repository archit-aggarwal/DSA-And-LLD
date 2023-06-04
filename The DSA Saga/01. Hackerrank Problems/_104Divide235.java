package Day17;

import java.util.*;

public class _104Divide235 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int steps = scn.nextInt();

        for (int k = 2; k <= 5; k++) {
            while (n % k == 0) {
                n /= k;
                steps += k;
            }
        }

        System.out.println(steps);
    }
}
