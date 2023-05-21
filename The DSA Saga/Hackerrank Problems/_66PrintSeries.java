package Day11;
import java.util.*;

public class _66PrintSeries {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();

        while (n >= l) {
            System.out.println(n);
            n -= k;
        }
    }
}
