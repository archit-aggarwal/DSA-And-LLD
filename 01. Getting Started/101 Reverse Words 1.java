//Link  https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
//TC : O(N)
//Extra Space : O(N)

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here
        StringBuilder sb = new StringBuilder("");
        int i = S.length()-1;
        
        while(i >= 0) {
            int j = i-1;
            
            while(j >= 0 && S.charAt(j) != '.') {
                j--;
            }
            
            for(int x=j+1;x<=i;x++) {
                sb.append(S.charAt(x));
            }
            
            i = j-1;
            if(i >= 0) sb.append(".");
        }
        
        return sb.toString();
        
    }
}
