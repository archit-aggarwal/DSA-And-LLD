package Day07;
import java.util.*;

public class _36AddIfDigit {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println((ch - '0') + 100);
        } else {
            System.out.println("This is not a digit");
        }
    }
}
