// https://www.codingninjas.com/studio/problems/ninja-and-sorted-arrays_1214628?leftPanelTab=0

// time = O(n1 + n2) ; space = O(1);

import java.io.*;
import java.util.*;

class Solution6 {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int n1, int n2) {
        int[] arr3 = new int[n1 + n2];
        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] <= arr2[p2]) {
                arr3[p3] = arr1[p1];
                p3++;
                p1++;
            } else {
                arr3[p3] = arr2[p2];
                p3++;
                p2++;
            }
        }
        while (p1 < n1) {
            arr3[p3] = arr1[p1];
            p3++;
            p1++;
        }
        while (p2 < n2) {
            arr3[p3] = arr2[p2];
            p3++;
            p2++;
        }
        return arr3;
    }
}
