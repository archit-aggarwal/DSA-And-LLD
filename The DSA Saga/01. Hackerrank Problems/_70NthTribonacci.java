package Day12;
import java.util.*;

public class _70NthTribonacci {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int p1 = 0, p2 = 1, p3 = 1, p4;

        while (n-- > 0) {
            p4 = p1 + p2 + p3;
            p1 = p2;
            p2 = p3;
            p3 = p4;
        }

        System.out.println(p1);
    }
}
