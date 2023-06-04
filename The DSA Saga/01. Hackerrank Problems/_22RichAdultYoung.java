package Day05;
import java.util.*;

public class _22RichAdultYoung {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();
        int salary = scn.nextInt();

        if (age > 40) {
            if (salary >= 30000)
                System.out.println("You are rich and adult");
            else
                System.out.println("You are an adult");
        } else {
            if (salary >= 12000)
                System.out.println("You are rich and young");
            else
                System.out.println("You are young");
        }
    }

}
