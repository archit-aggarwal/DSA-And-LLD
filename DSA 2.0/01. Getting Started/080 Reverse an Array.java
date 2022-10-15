/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void reverse(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // code

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            reverse(arr);
            display(arr);
        }
    }
}
