package Day10;

import java.util.*;

public class _57PrintPowersof2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();

        for (long res = 1; res < n; res *= 2) {
            System.out.print(res + " ");
        }
    }
}
