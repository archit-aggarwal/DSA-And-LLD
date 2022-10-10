//Link https://leetcode.com/problems/valid-palindrome-ii/
//TC : O(N)
//SC : O(1)

class Solution {
    
    public boolean isPalindrome(String str) {
        
        int lo = 0;
        int hi = str.length()-1;
        
        while(lo < hi) {
            if(str.charAt(lo) != str.charAt(hi)) return false;
            lo++;
            hi--;
        }
        
        return true;
    }
    
    public boolean validPalindrome(String s) {
        int lo = 0;
        int hi = s.length()-1;
        
        while(lo < hi) {
            if(s.charAt(lo) == s.charAt(hi)) {
                lo++;
                hi--;
            } else {
                boolean ans1 = isPalindrome(s.substring(lo,hi));
                boolean ans2 = isPalindrome(s.substring(lo+1,hi+1));
                return ans1 || ans2;
            }
        }
        
        return true;
    }
}
