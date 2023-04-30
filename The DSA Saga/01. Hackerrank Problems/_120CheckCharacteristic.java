package Day20;

import java.util.Scanner;

public class _120CheckCharacteristic {
    public static void checkCharacteristic(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > 0)
                arr[idx] = +1;
            else if (arr[idx] < 0)
                arr[idx] = -1;
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        checkCharacteristic(arr);
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
    }
}
