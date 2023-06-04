// https://practice.geeksforgeeks.org/problems/run-length-encoding/1

// Time Complexity: O(N) Space Complexity: O(1)

class Solution {
	String encode(String str) {
        StringBuilder res = new StringBuilder();
        
        int left = 0, right = 0;
        while(left < str.length()){
            char ch = str.charAt(left);
            int freq = 0;
            
            while(right < str.length() && str.charAt(right) == ch){
                freq++; right++;
            }
            
            res.append(ch);
            res.append(freq);
            left = right;
        }
        
        return res.toString();
	}
	
 }