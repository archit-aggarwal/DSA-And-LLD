package Day15;

import java.util.*;

public class _85GivenXYPrintXY {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();

        // XY = X at Ten's Place + Y at One's Place
        int res = 10 * x + 1 * y;
        System.out.println(res);
    }
}
