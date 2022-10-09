import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int res = 0;
       int p = 1;
       int bo = 0;
       while(n2 > 0) {
           int d1 = (n1 > 0) ? (n1 % 10) : 0;
           int d2 = (n2 > 0) ? (n2 % 10) : 0;
           
           int d = 0;
           if(d2 - d1 + bo < 0) {
               d = d2 - d1 + bo + b;
               bo = -1;
           } else {
               d = d2 -d1 + bo;
               bo = 0;
           }
           
           res += d*p;
           n1 = n1 / 10;
           n2 = n2 / 10;
           p *= 10;
       }
       
       return res;
   }
  
  }
