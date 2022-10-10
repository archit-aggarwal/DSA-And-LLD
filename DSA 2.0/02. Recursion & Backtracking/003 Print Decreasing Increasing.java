//Link : https://pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-increasing-decreasing-official/ojquestion
// TC: O(N)
//Recursion Space : O(N)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        
        if(n == 0) return;
        
        System.out.println(n);
        
        //recursion call
        pdi(n-1);
        
        System.out.println(n);
    }

}
