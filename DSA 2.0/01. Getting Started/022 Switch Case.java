import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
   
        switch(num) {
            case 10:
                System.out.println("Option 10");
                break;
            case 20:
                System.out.println("Option 20");
                break;
            case 30:
                System.out.println("Option 30");
                break;
            default:
                System.out.println("Please select out of 10, 20 or 30");
        }
        
    }
}
