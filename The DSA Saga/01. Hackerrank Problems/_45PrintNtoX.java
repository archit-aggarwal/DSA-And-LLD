package Day08;
import java.util.*;

public class _45PrintNtoX {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();

        for (int idx = n; idx >= x; idx--) {
            System.out.println(idx);
        }
    }
}