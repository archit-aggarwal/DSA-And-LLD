//Link : https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-stair-paths-official/ojquestion
//TC: O(3 ^ N)
//RS: O(N)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {
        
        //negative base case -> we don't want this to happen
        if(n < 0) {
            return;
        }
        
        //positive base case -> we want this to happen
        if(n == 0) {
            System.out.println(path);
            return;
        }
        
        printStairPaths(n-1,path + "1");
        printStairPaths(n-2,path + "2");
        printStairPaths(n-3,path + "3");
    }

}
