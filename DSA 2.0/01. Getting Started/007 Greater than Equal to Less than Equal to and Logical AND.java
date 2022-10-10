import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int guessNo = scn.nextInt();
        
        System.out.println("Start");
        
        if(guessNo >= 10 && guessNo <= 20) {
            System.out.println("You have won the game");
        } else {
            System.out.println("You have lost the game");
        }
        
        System.out.println("end");
        
    }
}
