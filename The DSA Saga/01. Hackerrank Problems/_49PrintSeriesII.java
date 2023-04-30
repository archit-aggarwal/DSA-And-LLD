package Day09;
import java.util.*;

public class _49PrintSeriesII {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        for (int idx = n; idx >= 0; idx -= k) {
            System.out.println(idx);
        }

    }
}
