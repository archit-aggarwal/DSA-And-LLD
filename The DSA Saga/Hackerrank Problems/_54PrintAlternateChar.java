package Day10;
import java.util.*;

public class _54PrintAlternateChar {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        for (int idx = 0; idx < str.length(); idx += 2) {
            System.out.print(str.charAt(idx));
        }
    }
}
