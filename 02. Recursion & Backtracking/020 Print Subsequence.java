//Link : https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion
//TC : O(2^N)
//Recursion Space : O(N)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str,0,"");
    }

    public static void printSS(String str, int idx, String asf) {
        
        if(idx == str.length()) {
            System.out.println(asf);
            return;
        }
        
        //yes
        printSS(str,idx + 1,asf + str.charAt(idx));
        
        //no
        printSS(str,idx + 1,asf);
    }

}
