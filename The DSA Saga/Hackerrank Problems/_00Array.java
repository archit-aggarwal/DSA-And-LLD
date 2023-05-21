package Day18;

import java.util.*;

public class _00Array {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // int[] marks = new int[5];

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // marks[0] = 83;
        // marks[1] = 75;
        // marks[2] = 96;
        // marks[3] = 30;
        // marks[4] = 63;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // for (int idx = 0; idx < marks.length; idx++) {
        // marks[idx] = scn.nextInt();
        // }

        // for (int idx = 0; idx < marks.length; idx++) {
        // System.out.print(marks[idx] + " ");
        // }

        // String[] cricketers = new String[3];

        // cricketers[0] = "Rohit Sharma";
        // cricketers[1] = "Virat Kohli";
        // cricketers[2] = "MS Dhoni";

        // System.out.println(cricketers[0]);
        // System.out.println(cricketers[1]);
        // System.out.println(cricketers[2]);

        int n = scn.nextInt();
        String[] cricketers = new String[n];

        for (int idx = 0; idx < n; idx++) {
            cricketers[idx] = scn.next();
        }

        for (int idx = 0; idx < n; idx++) {
            System.out.print(cricketers[idx] + " ");
        }

    }
}