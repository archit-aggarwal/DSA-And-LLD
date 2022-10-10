import java.util.*;
public class Main {
    
    public static int sum(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {        
        int x = 10;
        int res = sum(x);
        System.out.println(res);
    }
}
