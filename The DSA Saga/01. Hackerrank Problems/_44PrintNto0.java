package Day08;
import java.util.*;

public class _44PrintNto0 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Linear O(N)
        for (int idx = n; idx >= 0; idx--) {
            System.out.println(idx);
        }
    }
}
