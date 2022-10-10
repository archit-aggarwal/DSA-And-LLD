//Link : https://leetcode.com/problems/string-compression/
//TC : O(N)
//Extra Space : O(1)

class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        
        while(i < chars.length) {
            int j = i;
            
            while(j < chars.length && chars[j] == chars[i]) {
                j++;
            }
            
            chars[idx] = chars[i];
            idx++;
            
            String count = "" + (j-i);
            
            if(j-i > 1) {
               for(int x=0;x<count.length();x++) {
                   char ch = count.charAt(x);
                   chars[idx] = ch;
                   idx++;
               } 
            }
            
            i = j;
        }
        
        return idx;
    }
}
