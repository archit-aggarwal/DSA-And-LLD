import java.util.*;

class Solution6 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        int[] deep = new int[arr.length];
        for (int idx = 0; idx < arr.length; idx++) {
            deep[idx] = arr[idx];

        }
        int[] shallow = arr;

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(shallow));
        System.out.println(Arrays.toString(deep));
    }
}