package Day04;
import java.util.*;

public class _00IfElse {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        // System.out.println("Before Voting Day");

        // if (age >= 18) {
        // System.out.println("Age is Greater Than or Equal to 18");
        // System.out.println("Hence You can vote");
        // } else {
        // System.out.println("Age is less than 18");
        // System.out.println("Hence You cannot vote");
        // }

        // System.out.println("After Voting Day");

        if (age >= 75) {
            System.out.println("Old Age Pension");
        }
        if (age >= 21) {
            System.out.println("FTE Job Salary");
        }
        if (age >= 18) {
            System.out.println("Internship Stipend");
        }
        if (age >= 13) {
            System.out.println("Pocket Money");
        }
    }
}
