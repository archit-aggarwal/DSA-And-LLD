//Link : https://pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-decreasing-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        
        if(n == 0) return; //base case
        
        System.out.println(n);
        printDecreasing(n-1); //recursive call
    }

}
