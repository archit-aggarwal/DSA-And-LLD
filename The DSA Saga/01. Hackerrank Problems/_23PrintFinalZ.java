package Day05;
import java.util.*;

public class _23PrintFinalZ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        if (x >= 20) {
            if (y >= 100)
                z += 100;
            else if (y >= 50)
                z += 50;
            else
                z += 10;
        } else {
            if (y >= 100)
                z += 3;
            else if (y >= 50)
                z += 2;
            else
                z += 1;
        }
        System.out.println(z);
    }

}
