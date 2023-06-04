// https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/1

import java.util.*;

// Larger Among 2 (If Else)
class Solution1 {
    static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        }
        if (n > m) {
            return "greater";
        }
        return "equal";
    }
}

// Larger Among 3 (If Else If Ladder)
class Solution2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

// Larger Among 3 (Nester If Else)
class Solution3 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b) {
            // b cant be maxm
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            // a cant be maxm
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
