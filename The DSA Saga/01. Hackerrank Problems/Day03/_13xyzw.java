package Day03;
import java.util.*;

public class _13xyzw {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        int w = scn.nextInt();

        int xy = x * y;
        int zw = z * w;
        System.out.println(xy == zw);
    }
}
