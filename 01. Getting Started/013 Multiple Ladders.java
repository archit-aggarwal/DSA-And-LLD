import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        System.out.println("Start");
        
        if(x == 10) {
            System.out.println("You have won the game");
        } else if(x == 20) {
             System.out.println("You have lost the game");
        } 
        
        if(x != 100) {
            System.out.println("x value was not 100");
        }
        
        System.out.println("end");       
    }
}
