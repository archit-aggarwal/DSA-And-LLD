import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int digitMultiplication(int n1, int digit,int b) {
     
     if(n1 == 0) return 0;
     
     int c = 0;
     int res = 0;
     int p = 1;
     
     while(n1 > 0 || c > 0) {
        int d1 = (n1 > 0) ? (n1 % 10) : 0;
        
        int d = 0;
        
        if(digit * d1 + c >= b) {
            d = (digit * d1 + c) % b;
            c = (digit * d1 + c) / b;
        } else {
            d = digit * d1 + c;
            c = 0;
        }
        
        res += d * p;
        p *= 10;
        n1 = n1 / 10;
     }
     
     return res;
 }
 
 public static int anyBaseAddition(int n1, int n2, int b) {
     int res = 0;
     int p = 1;
     int c = 0;
     
     while(n1 > 0 || n2 > 0 || c > 0) {
        int d1 = (n1 > 0) ? (n1 % 10) : 0;
        int d2 = (n2 > 0) ? (n2 % 10) : 0;
        
        int digit = 0;
        if(d1 + d2 + c < b) {
            digit = d1 + d2 + c;
            c = 0;
        } else {
            digit = (d1 + d2 + c) % b;
            c = (d1 + d2 + c) / b;
        }
        
        res += digit * p;
        p *= 10;
        n1 = n1 / 10;
        n2 = n2 / 10;
     }
     
     return res;
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int res = 0;
     int p = 1;
     
     while(n2 > 0) {
        int d2 = (n2 > 0) ? (n2 % 10) : 0;
        int tempRes = digitMultiplication(n1,d2,b);
        
        res = anyBaseAddition(tempRes*p,res,b);
        p *= 10;
        n2 = n2 / 10; 
     }
     
     return res;
 }

}
