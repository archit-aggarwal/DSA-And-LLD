// https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

import java.util.*;

class Solution15 {
    static ArrayList<String> paths;

    public static void findPath(int[][] mat, int row, int col, String path) {
        if (row < 0 || col < 0 || row == mat.length || col == mat[0].length) {
            // index out of bound -> negative base case
            return;
        }
        if (mat[row][col] == -1 || mat[row][col] == 0) {
            // visited call or blocked cell -> negative base case
            return;
        }
        if (row == mat.length - 1 && col == mat[0].length - 1) {
            // destination -> positive base case
            paths.add(path);
            return;
        }
        mat[row][col] = -1; // visited mark

        // top or up
        findPath(mat, row - 1, col, path + "U");

        // down
        findPath(mat, row + 1, col, path + "D");

        // left
        findPath(mat, row, col - 1, path + "L");

        // right
        findPath(mat, row, col + 1, path + "R");

        mat[row][col] = 1; // unvisited mark (backtracking)
    }

    public static ArrayList<String> findPath(int[][] mat, int n) {
        paths = new ArrayList<>();
        findPath(mat, 0, 0, "");
        return paths;
    }
}

// short syntax

class Solution {
    static ArrayList<String> paths;

    static int[] x = { -1, +1, 0, 0 };
    static int[] y = { 0, 0, -1, +1 };
    static char[] moves = { 'U', 'D', 'L', 'R' };

    public static void findPath(int[][] mat, int row, int col, String path) {
        if (row < 0 || col < 0 || row == mat.length || col == mat[0].length) {
            // index out of bound -> negative base case
            return;
        }
        if (mat[row][col] == -1 || mat[row][col] == 0) {
            // visited call or blocked cell -> negative base case
            return;
        }
        if (row == mat.length - 1 && col == mat[0].length - 1) {
            // distinguish -> positive base case
            paths.add(path);
            return;
        }

        mat[row][col] = -1; // visited mark

        for (int idx = 0; idx < 4; idx++) {
            int dx = x[idx], dy = y[idx];
            char move = moves[idx];
            findPath(mat, row + dx, col + dy, path + move);
        }
        mat[row][col] = 1; // unvisited mark (backtracking)
    }

    public static ArrayList<String> findPath(int[][] mat, int n) {
        paths = new ArrayList<>();
        findPath(mat, 0, 0, "");
        return paths;
    }
}