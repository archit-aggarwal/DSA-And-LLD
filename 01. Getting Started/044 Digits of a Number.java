import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     Scanner scn = new Scanner(System.in);
     
     int n = scn.nextInt();
     
     //digits of a number
     
     if(n == 0) {
         System.out.println(0);
         return;
     }
     
     
     while(n > 0) {
        int digit = n % 10;
        System.out.println(digit);
        n /= 10;
     }
     
     
    }
   }
