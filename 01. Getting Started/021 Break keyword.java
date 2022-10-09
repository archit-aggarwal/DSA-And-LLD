import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for(int i=1;i<=10;i++) {
            if(i % 3 == 0) {
                break;
            }
            System.out.println(i);
        }       
    }
}
