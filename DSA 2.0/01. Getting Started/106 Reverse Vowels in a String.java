//Link : https://leetcode.com/problems/reverse-vowels-of-a-string/
//Time Complexity : O(N)
//Extra Space : O(N) (as we used a StringBuilder)

class Solution {
    
    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        
        return false;
    }
    
    public String reverseVowels(String s) {
        int lo = 0;
        int hi = s.length() -1;
        
        StringBuilder sb = new StringBuilder(s);
        
        while(lo < s.length() && isVowel(s.charAt(lo)) == false) {
            lo++;
        }
        
        while(hi >= 0 && isVowel(s.charAt(hi)) == false) {
            hi--;
        }
        
        while(lo < hi) {
            char temp = sb.charAt(lo);
            sb.setCharAt(lo,sb.charAt(hi));
            sb.setCharAt(hi,temp);
            
            lo++;
            hi--;
            
              while(lo < s.length() && isVowel(s.charAt(lo)) == false) {
                lo++;
              }
        
              while(hi >= 0 && isVowel(s.charAt(hi)) == false) {
                  hi--;
              }
        }
        
        return sb.toString();
    }
}
