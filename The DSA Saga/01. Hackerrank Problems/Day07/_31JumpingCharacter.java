package Day07;
import java.util.*;

public class _31JumpingCharacter {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);

        if (ch >= 'a' && ch <= 'w') {
            // Jumping 3 Characters in Right
            System.out.println((char) (ch + 3));
        } else if (ch >= 'D' && ch <= 'Z') {
            // Jumping 3 Characters in Left
            System.out.println((char) (ch - 3));
        } else {
            System.out.println("Can't jump");
        }
    }
}
