package Day02;
import java.util.*;

public class _08SumDifferenceXY {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();

        int sum = x + y;
        System.out.println(sum);

        int difference = x - y;
        System.out.println(difference);
    }
}
