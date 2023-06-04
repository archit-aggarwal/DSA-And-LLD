package Day16;
import java.util.*;

public class _97FindProduct {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int tests = scn.nextInt();

        while(tests-- > 0){
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println(findProduct(x, y));
        }
    }

    public static int findProduct(int x, int y){
        int res = x * y;
        return res;
    }
}
