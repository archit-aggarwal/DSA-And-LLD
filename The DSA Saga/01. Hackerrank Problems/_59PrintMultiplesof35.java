package Day10;

import java.util.*;

public class _59PrintMultiplesof35 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // linear O(n)
        for (int idx = 1; idx <= n; idx++) {
            if (idx % 3 == 0 || idx % 5 == 0)
                System.out.print(idx + " ");
        }
    }
}
