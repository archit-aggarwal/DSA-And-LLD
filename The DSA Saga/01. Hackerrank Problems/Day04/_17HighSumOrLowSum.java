package Day04;
import java.util.*;

public class _17HighSumOrLowSum {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();

        if (x + y >= 100)
            System.out.println("High Sum");
        else
            System.out.println("Low Sum");
    }
}
