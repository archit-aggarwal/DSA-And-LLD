import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       
       int res = 0;
       int p = 1;
       int ca = 0;
       
       while(n1 > 0 || n2 > 0 || ca > 0) {
           int d1 = (n1 > 0) ? (n1 % 10) : 0;
           int d2 = (n2 > 0) ? (n2 % 10) : 0;
           
           int d = 0;
           if(d1 + d2 + ca >= b) {
               d = (d1 + d2 + ca) % b;
               ca = (d1 + d2 + ca) /b;
           } else {
               d = d1 + d2 + ca;
               ca = 0;
           }
           
           n1 = n1 / 10;
           n2 = n2 / 10;
           res += d*p;
           p *= 10;
       }
       
       return res;
   }
  }
