package Day04;
import java.util.*;

public class _18ShopDiscount {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int units = scn.nextInt();
        int totalCost = units * 100;

        if (totalCost > 1000) {
            int discount = totalCost / 10;
            // totalCost = totalCost - discount;
            totalCost -= discount;
        }

        System.out.println(totalCost);

        // Approach 2
        // if(totalCost > 1000){
        // int discount = totalCost / 10;
        // System.out.println(totalCost - discount);
        // } else {
        // System.out.println(totalCost);
        // }
    }
}
