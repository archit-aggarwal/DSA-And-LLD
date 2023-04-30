package Day18;
import java.util.*;

public class _107PrintReverseArray {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < arr.length; idx++)
            arr[idx] = scn.nextInt();

        for (int idx = arr.length - 1; idx >= 0; idx--)
            System.out.println(arr[idx]);
    }
}
