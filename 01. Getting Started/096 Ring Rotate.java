//Link : https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/ring-rotate-official/ojquestion
// Time Complexity : O(N + M) -> max size of the shell
//Extra Space : O(N + M) -> max size of the auxiliary array that we have to use to rotate the shell

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        shellRotate(arr,s,r);
        display(arr);
    }
    
    public static int[] fillOneDFromShell(int[][] arr, int s) {
        int fr = s-1;
        int fc = s-1;
        int lr = arr.length -s;
        int lc = arr[0].length -s;
        
        int size = 2 * (lr - fr + lc - fc);
        int[] oneD = new int[size];
        int idx = 0;
        
        //first col
        for(int i=fr;i<=lr;i++) {
            oneD[idx] = arr[i][fc];
            idx++;
        }
        fc++;
        
        //last row
        for(int j=fc;j<=lc;j++) {
            oneD[idx] = arr[lr][j];
            idx++;
        }
        lr--;
        
        //last col
        for(int i=lr;i>=fr;i--) {
            oneD[idx] = arr[i][lc];
            idx++;
        }
        lc--;
        
        //first row
        for(int j=lc;j>=fc;j--) {
            oneD[idx] = arr[fr][j];
            idx++;
        }
        
        fr++;
        
        return oneD;
    }
    
    public static void fillShellFromOneD(int[][] arr, int s, int[] oneD) {
        int fr = s-1;
        int fc = s-1;
        int lr = arr.length -s;
        int lc = arr[0].length -s;
        
        int idx = 0;
        
        //first col
        for(int i=fr;i<=lr;i++) {
            arr[i][fc] = oneD[idx];
            idx++;
        }
        fc++;
        
        //last row
        for(int j=fc;j<=lc;j++) {
            arr[lr][j] = oneD[idx];
            idx++;
        }
        lr--;
        
        //last col
        for(int i=lr;i>=fr;i--) {
            arr[i][lc] = oneD[idx];
            idx++;
        }
        lc--;
        
        //first row
        for(int j=lc;j>=fc;j--) {
            arr[fr][j] = oneD[idx];
            idx++;
        }
        
        fr++;
    }
    
    public static void shellRotate(int[][] arr,int s, int r) {
        int[] oneD = fillOneDFromShell(arr,s);
        rotate(oneD,r);
        fillShellFromOneD(arr,s,oneD);
    }
    
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        
        k = k % n;
        if(k < 0) k = k + n;
        
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
    
    public static void reverse(int[] arr,int lo, int hi) {
        while(lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
