package Day07;
import java.util.*;

public class _35CharAt3rdIndex {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        if (str.length() >= 4)
            System.out.println(str.charAt(3));
        else
            System.out.println("Small string");
    }
}
