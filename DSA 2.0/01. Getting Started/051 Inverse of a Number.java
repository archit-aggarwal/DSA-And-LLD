import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  int pv = 1;
  int inverse = 0;
  
  while(n > 0) {
      int fv = n % 10;
      n /= 10;
      
      inverse += pv * (int)Math.pow(10,fv-1);
      pv++;
  }
  
  System.out.println(inverse);
  
 }
}
