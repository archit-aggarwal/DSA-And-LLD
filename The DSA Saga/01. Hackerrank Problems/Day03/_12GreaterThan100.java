package Day03;
import java.util.*;

public class _12GreaterThan100 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        boolean ans = num > 100;
        System.out.println(ans);
    }
}
