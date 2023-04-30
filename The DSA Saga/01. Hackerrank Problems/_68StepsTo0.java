package Day12;
import java.util.*;

public class _68StepsTo0 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int steps = 0;

        while (n > 0) {
            steps++;
            if (n % 2 == 0)
                n -= 1;
            else
                n -= 3;
        }
        System.out.println(steps);
    }
}
