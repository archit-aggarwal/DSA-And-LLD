import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here
     
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     
     int temp = n;
     int nod = 0;
     while(temp > 0) {
         nod++;
         temp /= 10;
     }
     
     k = k % nod;
     if(k < 0) k = k + nod;
     
     int last = n % (int)Math.pow(10,k);
     n = n / (int)Math.pow(10,k);
     last = last * (int)Math.pow(10,nod-k);
     n = n + last;
     
     System.out.println(n);
     
    }
   }
