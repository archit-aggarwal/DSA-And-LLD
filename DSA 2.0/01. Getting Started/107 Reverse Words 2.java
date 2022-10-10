//Link : https://leetcode.com/problems/reverse-words-in-a-string/
// Time Complexity : O(N)
// Extra Space: O(N) (using a stringbuilder)

class Solution {
    public String reverseWords(String s) {
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder("");
        
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        while(i >= 0) {
            int j = i-1;
            
            while(j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            
            for(int x=j+1;x<=i;x++) {
                sb.append(s.charAt(x));
            }
            
            while(j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            
            i = j;
            if(i >= 0) sb.append(' ');
        }
        
        return sb.toString();
    }
}
