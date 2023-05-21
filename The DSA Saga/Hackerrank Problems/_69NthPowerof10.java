package Day12;
import java.util.*;

public class _69NthPowerof10 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long res = 1; // 10 ^ 0 = 1

        while (n-- > 0) {
            res *= 10;
        }
        System.out.println(res);
    }
}
