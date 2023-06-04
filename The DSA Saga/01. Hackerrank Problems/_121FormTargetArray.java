package Day20;

import java.util.*;

public class _121FormTargetArray {
    public static int[] solve(int[] numbers, int[] index) {
        int n = numbers.length;
        int[] target = new int[n];

        for (int i = 0; i < n; i++)
            target[index[i]] = numbers[i];

        return target;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = scn.nextInt();

        int[] index = new int[n];
        for (int i = 0; i < n; i++)
            index[i] = scn.nextInt();

        int[] target = solve(numbers, index);
        for (int i = 0; i < n; i++)
            System.out.print(target[i] + " ");
    }
}
