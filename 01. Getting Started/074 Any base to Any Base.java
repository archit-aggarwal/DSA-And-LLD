import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int ans = anyBaseToAnyBase(n,sourceBase,destBase);
     System.out.println(ans);
   } 
   
   public static int anyBaseToAnyBase(int n, int src,int dest) {
       int decimal = anyBaseToDecimal(n,src);
       int ans = decimalToAnyBase(decimal,dest);
       return ans;
   }
   
   public static int decimalToAnyBase(int n, int b){
       // write code here
       
       int ans = 0;
       int p = 0;
       while(n != 0) {
           int rem = n % b;
           n /= b;
           ans += rem * (int)Math.pow(10,p);
           p++;
       }
       
       return ans;
   }
   
    public static int anyBaseToDecimal(int n, int b){
      // write your code here
      
      int ans = 0;
      int pv = 0;
      while(n != 0) {
          int fv = n % 10;
          n /= 10;
          ans += fv * (int)Math.pow(b,pv);
          pv++;
      }
      
      return ans;
   }
   
  }
