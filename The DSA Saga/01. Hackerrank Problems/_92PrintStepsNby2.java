package Day15;

import java.util.*;

public class _92PrintStepsNby2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int steps = 0;

        while (n >= 1) {
            n /= 2;
            steps++;
        }

        System.out.println(steps);
    }
}
