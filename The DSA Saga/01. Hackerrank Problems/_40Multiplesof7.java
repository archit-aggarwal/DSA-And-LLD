package Day08;

import java.util.*;

public class _40Multiplesof7 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int idx = 7; idx <= n; idx += 7) {
            System.out.println(idx);
        }
    }
}
