package Day06;
import java.util.*;

public class _29PrintZGivenXYII {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        if (x % 3 == 0) {
            if (y >= 200)
                z += 10;
            else if (y >= 100)
                z += 5;
            else if (y >= 50)
                z += 4;
            else
                z += 1;
        } else {
            if (y >= 200)
                z += 3;
            else if (y >= 100)
                z += 2;
            else
                z += 1;
        }

        z += 10;
        System.out.println(z);
    }
}
