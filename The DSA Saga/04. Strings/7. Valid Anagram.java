// https://leetcode.com/problems/valid-anagram/description/

// Time Complexity: O(N) Space Complexity: O(1)

class Solution {
    public int[] getFrequency(String str){
        int[] freq = new int[26];
        
        for(char ch: str.toCharArray()){
            freq[ch - 'a']++;
        }
        return freq;
    }

    public boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        
        int[] f1 = getFrequency(s1);
        int[] f2 = getFrequency(s2);

        for(int idx = 0; idx < 26; idx++){
            if(f1[idx] != f2[idx])
                return false;
        }

        return true;
    }
}