package Day02;
import java.util.*;

public class _07StdinStdout2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int val1 = scn.nextInt();
        double val2 = scn.nextDouble();
        scn.nextLine();
        String val3 = scn.nextLine();

        System.out.println("String: " + val3);
        System.out.println("Double: " + val2);
        System.out.println("Int: " + val1);
    }
}
