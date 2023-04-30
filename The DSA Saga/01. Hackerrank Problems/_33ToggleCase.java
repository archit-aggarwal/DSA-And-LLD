package Day07;
import java.util.*;

public class _33ToggleCase {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);

        if (ch >= 'a' && ch <= 'z')
            System.out.println((char) (ch - 32));
        else
            System.out.println((char) (ch + 32));
    }
}
