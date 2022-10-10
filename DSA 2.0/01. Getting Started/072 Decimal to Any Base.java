import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
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
  }
