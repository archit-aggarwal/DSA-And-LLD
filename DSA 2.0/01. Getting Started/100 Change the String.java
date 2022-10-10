//Link https://practice.geeksforgeeks.org/problems/change-the-string3541/1
//TC: O(N)
//SC: O(N)

class Solution{
    String modify(String s){
        if(s.length() == 0 || s == null) return s;
        
        boolean isLowerCase = false;
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') isLowerCase = true;
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' && isLowerCase == false) {
                ch = (char)(ch - 32);
            } else if(ch >= 'A' && ch <= 'Z' && isLowerCase == true) {
                ch = (char)(ch + 32);
            }
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
