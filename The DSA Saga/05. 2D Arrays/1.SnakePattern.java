// https://practice.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1

// time = O(n^2) {rows = cols = n}  ; space = O(1);

import java.util.*;

class solution1 {
    static ArrayList<Integer> snakePattern(int mat[][]) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int row = 0; row < mat.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < mat[row].length; col++) {
                    res.add(mat[row][col]);
                }
            } else {
                for (int col = mat[row].length - 1; col >= 0; col--) {
                    res.add(mat[row][col]);
                }
            }
        }
        return res;
    }
}