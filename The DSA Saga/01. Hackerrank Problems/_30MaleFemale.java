package Day07;
import java.util.*;

public class _30MaleFemale {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char gender = scn.next().charAt(0);

        if (gender == 'm' || gender == 'M')
            System.out.println("You are a male");
        else if (gender == 'f' || gender == 'F')
            System.out.println("You are a female");
        else
            System.out.println("Type again");
    }
}
