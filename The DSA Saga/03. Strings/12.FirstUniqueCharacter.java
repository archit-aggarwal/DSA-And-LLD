// https://leetcode.com/problems/first-unique-character-in-a-string/description/

// time = O(n) linear ; space = O(1) constant/inplace

import java.util.*;

class Solution12 {
    public int firstUniqChar(String str) {
        int[] freq = new int[26];

        // Fill the frequency array
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Find the first Unique or non repeating or distinct character
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (freq[ch - 'a'] == 1)
                return idx;
        }
        return -1;
    }
}