// https://leetcode.com/problems/first-unique-character-in-a-string/

// Time Complexity: O(N) Space Complexity: O(1)

class Solution {
    public int firstUniqChar(String str) {
        int[] freq = new int[26];

        // Fill the Frequency Array
        for(char ch: str.toCharArray()){
            freq[ch - 'a']++;
        }

        // Find the First Unique or Non Repeating or Distinct Character
        for(int idx = 0; idx < str.length(); idx++){
            char ch = str.charAt(idx);
            if(freq[ch - 'a'] == 1) return idx;
        }

        return -1;
    }
}