// https://practice.geeksforgeeks.org/problems/nextline-and-next/1

// Time: O(1) - Space O(1)

import java.util.*;

class Geeks {
    @SuppressWarnings("all")
    static void getInput() {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // Taking the number of testcases

        while (t-- > 0) {
            // Your code here
            int a = scn.nextInt();
            scn.nextLine();
            String s = scn.nextLine();

            System.out.println(a);
            System.out.println(s);
        }

    }
}