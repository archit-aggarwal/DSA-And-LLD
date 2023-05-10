import java.util.*;

class Solution3 {
    // ACTUAL SWAPPING TAKES PLACE
    public static void main(String[] args) {
        int[] arr = { 7, 12 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int ptr1, int ptr2) {
        System.out.println(Arrays.toString(arr));
        int temp = arr[ptr1];
        arr[ptr1] = arr[ptr2];
        arr[ptr2] = temp;
        System.out.println(Arrays.toString(arr));
    }
    // SWAPPING NOT DONE
    // public static void main(String[] args){
    // int[] arr = {7 , 12} ;
    // System.out.println(Arrays.toString(arr));
    // swap(arr[0] , arr[1]);
    // System.out.println(Arrays.toString(arr));

    // }
    // public static void swap(int a , int b){
    // System.out.println(a + " " + b);
    // int temp = a ;
    // a = b ;
    // b = temp ;
    // System.out.println(a + " " + b);
    // }

}