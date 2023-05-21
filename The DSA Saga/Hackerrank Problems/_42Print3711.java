package Day08;
import java.util.*;

public class _42Print3711 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int idx = 3; idx < n; idx += 4) {
            System.out.println(idx);
        }
    }
}
