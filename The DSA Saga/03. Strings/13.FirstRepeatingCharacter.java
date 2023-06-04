// https://practice.geeksforgeeks.org/problems/repeated-character2058/1 

import java.util.*;

class Solution13 {
    // using two loops
    char firstRep(String str) {
        int[] freq = new int[26];

        // Fill the frequency array
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : str.toCharArray()) {
            if (freq[ch - 'a'] > 1)
                return ch;
        }

        return '#';
    }

    // using only one loop
    char firstRep(String str) {
        int[] freq = new int[26];
        char repeating = '#';

        for (int idx = str.length() - 1; idx >= 0; idx--) {
            char ch = str.charAt(idx);
            freq[ch - 'a']++;
            if (freq[ch - 'a'] > 1)
                repeating = ch;
        }

        return repeating;
    }
}