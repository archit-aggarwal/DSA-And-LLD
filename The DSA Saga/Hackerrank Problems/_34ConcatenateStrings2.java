package Day07;
import java.util.*;

public class _34ConcatenateStrings2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.next();
        String str2 = scn.next();

        if (str1.length() < str2.length())
            System.out.println(str1 + str2 + str1);
        else
            System.out.println(str2 + str1 + str2);
    }
}
