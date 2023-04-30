package Day11;
import java.util.*;

public class _64Print5toN {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int idx = 5;
        while (idx <= n) {
            System.out.println(idx);
            idx++;
        }
    }
}
