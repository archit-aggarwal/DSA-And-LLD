package Day03;
import java.util.*;

public class _15EvenOrNot {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        boolean isEven = (num % 2 == 0);
        System.out.println(isEven);
    }
}
