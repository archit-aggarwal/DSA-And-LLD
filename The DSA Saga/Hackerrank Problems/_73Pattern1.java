package Day13;
import java.util.*;

public class _73Pattern1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // o(N)
        for (int idx = 1; idx <= n; idx++) {
            System.out.print("*");
        }
    }
}
