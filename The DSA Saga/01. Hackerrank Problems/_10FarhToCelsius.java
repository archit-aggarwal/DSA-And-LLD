package Day02;
import java.util.*;

public class _10FarhToCelsius {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double farh = scn.nextDouble();
        double celsius = (farh - 32.0) * 5.0 / 9.0;

        System.out.println(celsius);
    }
}
