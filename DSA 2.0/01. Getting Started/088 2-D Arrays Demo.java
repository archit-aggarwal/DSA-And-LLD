import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();
    
    //declaration + initialization
    int[][] mat = new int[row][col];
    
    for(int i=0;i<mat.length;i++) {
        for(int j=0;j<mat[0].length;j++) {
            mat[i][j] = scn.nextInt();
        }
    }
    
    for(int i=0;i<mat.length;i++) {
        for(int j=0;j<mat[0].length;j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
 }

}
