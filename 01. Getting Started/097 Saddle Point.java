// Link : https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/saddle-price-official/ojquestion
// Time complexity : O(N*N) square matrix
//Extra space: O(1)

import java.io.*;
import java.util.*;

public class Main {

    public static int solve(int[][] arr) {
        int n = arr.length;
        int row = -1;
        int col = -1;
        boolean flag = false;
        for(int i=0;i<n;i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j=0;j<n;j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    minIdx = j;
                }
            }
            
            //minIdx column me max element search karenge
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for(int r=0;r<n;r++) {
                if(arr[r][minIdx] > max) {
                    max = arr[r][minIdx];
                    maxIdx = r;
                }
            }
            
            if(maxIdx == i) {
                row = maxIdx;
                col = minIdx;
                flag = true;
                break;
            }
        }
        
        if(!flag) return -1;
        
        return arr[row][col];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        if(solve(arr) == -1) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(solve(arr));
    }

}
