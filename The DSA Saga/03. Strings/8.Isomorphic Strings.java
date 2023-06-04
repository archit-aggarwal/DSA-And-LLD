// https://leetcode.com/problems/isomorphic-strings/

// Time Complexity: O(N) Space Complexity: O(1)

class Solution {
    public boolean mapOneToOne(String s1, String s2){
        char[] map = new char[256]; // ascii code

        for(int idx = 0; idx < s1.length(); idx++){
            char ch1 = s1.charAt(idx);
            char ch2 = s2.charAt(idx);

            if(map[ch1] != '\u0000' && map[ch1] != ch2){
                return false;
            }

            map[ch1] = ch2;
        }

        return true;
    }
    
    public boolean isIsomorphic(String s1, String s2) {
        return mapOneToOne(s1, s2) && mapOneToOne(s2, s1);
    }
}