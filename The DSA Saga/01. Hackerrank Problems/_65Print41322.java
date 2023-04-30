package Day11;
import java.util.*;

public class _65Print41322 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int idx = 4;
        while (idx <= n) {
            System.out.println(idx);
            idx += 9;
        }
    }
}
