// https://practice.geeksforgeeks.org/problems/repeated-character2058/1

// Time Complexity: O(N) Space Complexity: O(1)

// Approach 1: 

class Solution {
    char firstRep(String str) {
        int[] freq = new int[26];
        
        // Fill the Frequency Array
        for(char ch: str.toCharArray()){
            freq[ch - 'a']++;
        }
        
        // Find the First Unique Non Repeating or Distinct Character
        for(char ch: str.toCharArray()){
            if(freq[ch - 'a'] > 1) return ch;
        }
        
        return '#';
    }
}

// Approach 2: 

class Solution {
    char firstRep(String str) {
        int[] freq = new int[26];
        char repeating = '#';
        
        for(int idx = str.length() - 1; idx >= 0; idx--){
        	char ch = str.charAt(idx);
        	freq[ch - 'a']++;
        	if(freq[ch - 'a'] > 1) repeating = ch;
        }
        
        return repeating;
    }
}