package Day07;

import java.util.*;

public class _GradeSwitch {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char grade = scn.next().charAt(0);

        switch (grade) {
            case 'A': {
                System.out.println("Excellent!");
                break;
            }
            case 'B': {
                System.out.println("Well done!");
                break;
            }
            case 'C': {
                System.out.println("You passed!");
                break;
            }
            case 'F': {
                System.out.println("Better luck next time!");
                break;
            }
            default: {
                System.out.println("Invalid grade");
            }
        }
    }
}
