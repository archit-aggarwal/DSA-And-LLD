package Day04;
import java.util.*;

public class _19PrintBonus {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int salary = scn.nextInt();
        int years = scn.nextInt();

        if (years > 5) {
            int bonus = salary * 5 / 100;
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }
    }
}