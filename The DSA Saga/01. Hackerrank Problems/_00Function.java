package Day16;

import java.util.*;

public class _00Function {
    // Function Definition: Returntype, Dataypes of Arguments
    public static void marksToGrade(int marks) {
        if (marks > 90) {
            System.out.println("O");
            // 91 - 100
        } else if (marks > 80) {
            System.out.println("A+");
            // 81 - 90
        } else if (marks > 70) {
            System.out.println("A");
            // 71 - 80
        } else if (marks > 60) {
            System.out.println("B+");
            // 61 - 70
        } else if (marks > 40) {
            System.out.println("B");
            // 41 - 60
        } else {
            System.out.println("F");
        }
    }

    
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        System.out.println("Inside Main Function Before Call " + a);
        fun(a);
        System.out.println("Inside Main Function After Call " + a);
    }

    public static void fun(int b) {
        System.out.println("Inside Fun Function While Entering " + b);
        b++;
        System.out.println("Inside Fun Function While Exiting " + b);
        
    }

}
