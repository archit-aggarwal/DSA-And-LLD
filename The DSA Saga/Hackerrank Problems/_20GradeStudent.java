package Day04;
import java.util.*;

public class _20GradeStudent {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int marks = scn.nextInt();

        if (marks > 90) {
            System.out.println("excellent");
            // 91 - 100
        } else if (marks > 80) {
            System.out.println("good");
            // 81 - 90
        } else if (marks > 70) {
            System.out.println("fair");
            // 71 - 80
        } else if (marks > 60) {
            System.out.println("meets expectations");
            // 61 - 70
        } else if (marks > 40) {
            System.out.println("below par");
            // 41 - 60
        } else {
            System.out.println("failed");
        }
    }
}
