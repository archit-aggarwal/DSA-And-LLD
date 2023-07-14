// https://www.codingninjas.com/studio/problems/print-all-possible-paths-from-top-left-corner-to-bottom-right-corner-of-a-2-d-matrix_1171152?leftPanelTab=0

import java.util.*;

class Solution14 {
    static List<List<Integer>> paths;

    public static void printPaths(int[][] mat, int row, int col, List<Integer> path) {
        if (row == mat.length || col == mat[0].length) {
            // negative base case (out of matrix)
            return;
        }

        if (row == mat.length - 1 && col == mat[0].length - 1) {
            // positive base case (bottom right)
            path.add(mat[row][col]); // work
            paths.add(new ArrayList<>(path)); // deep copy
            path.remove(path.size() - 1); // backtracking (undo)
            return;

        }
        path.add(mat[row][col]); // work

        // faith recursive calls
        printPaths(mat, row, col + 1, path); // right or horizontal
        printPaths(mat, row + 1, col, path); // down or vertical

        path.remove(path.size() - 1); // backtracking (undo)
    }

    public static int[][] printAllPaths(int[][] mat, int m, int n) {
        paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        printPaths(mat, 0, 0, path);

        int[][] res = new int[paths.size()][paths.get(0).size()];

        for (int r = 0; r < res.length; r++) {
            for (int c = 0; c < res[0].length; c++) {
                res[r][c] = paths.get(r).get(c);
            }
        }
        return res;
    }
}
