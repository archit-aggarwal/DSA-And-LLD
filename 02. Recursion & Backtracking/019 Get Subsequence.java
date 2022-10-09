//Link : https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-subsequence-official/ojquestion
//TC: O(2 ^ N)
//Recursion Space : O(N)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0 || str.equals("")) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        
        ArrayList<String> smallAns = gss(str.substring(1));
         ArrayList<String> res = new ArrayList<>();
        
        for(String subsequence : smallAns) {
            res.add(subsequence);
        }
        
        for(String subsequence : smallAns) {
            subsequence = str.charAt(0) + subsequence;
            res.add(subsequence);
        }
        
        return res;
    }

    public static ArrayList<String> gss(String str,int idx) {
        
        if(idx == str.length()) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        
        ArrayList<String> smallAns = gss(str,idx + 1);
        ArrayList<String> res = new ArrayList<>();
        
        for(String subsequence : smallAns) {
            res.add(subsequence);
        }
        
        for(String subsequence : smallAns) {
            subsequence = str.charAt(idx) + subsequence;
            res.add(subsequence);
        }
        
        return res;
    }

}
