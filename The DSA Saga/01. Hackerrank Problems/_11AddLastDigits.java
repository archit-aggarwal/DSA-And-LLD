package Day02;
import java.util.*;

public class _11AddLastDigits {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int digit1 = num1 % 10;
        int digit2 = num2 % 10;

        System.out.println(digit1 + digit2);
    }
}
