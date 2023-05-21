package Day15;

import java.util.*;

public class _93FindMaximum {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int max = -100, steps = 0;

        while (n-- > 0) {
            int val = scn.nextInt();
            if (val > max) {
                max = val;
                steps++;
            }
        }

        System.out.println(steps);
    }
}
