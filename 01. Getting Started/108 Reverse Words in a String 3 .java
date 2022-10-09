//Link : https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Time Complexity: O(N)
// Extra Space: O(N)

class Solution {
    public String reverseWords(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder("");
        
        while(i < s.length()) {
            int j = i + 1;
            
            while(j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            
            for(int x=j-1;x>=i;x--) {
                sb.append(s.charAt(x));
            }
            
            i = j + 1;
            if(i < s.length()) sb.append(' ');
        }
        
        return sb.toString();
    }
}
