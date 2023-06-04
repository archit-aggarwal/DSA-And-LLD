// https://www.codingninjas.com/codestudio/problems/all-substrings_1262347

// time = O(n^3) cubic ; space = O(1) constant 

import java.util.*;

class Solution10 {
    // approach: 1
    static void printSubstrings(String str) {
        for (int start = 0; start < str.length(); start++) {
            for (int end = start; end < str.length(); end++) {
                for (int idx = start; idx <= end; idx++) {
                    System.out.print(str.charAt(idx));
                }
                System.out.println();
            }
        }
    }

    // approach: 2
    static void printSubstrings(String str) {
        for (int start = 0; start < str.length(); start++) {
            for (int end = start; end < str.length(); end++) {
                System.out.println(str.substring(start, end + 1));
            }
        }
    }
}