// APPROACH : 1

// TIME = O(2^n) ; SPACE = O(n);

import java.util.*;

class Solution17 {
    List<List<Integer>> ways;

    public void printPaths(int n, int k, List<Integer> output) {
        if (k == 0) {
            ways.add(new ArrayList<>(output)); // deep copy
            return; // positive base case
        }
        if (n == 0 || k > n) {
            return; // negative base case
        }

        // yes choice
        output.add(n);
        printPaths(n - 1, k - 1, output);
        output.remove(output.size() - 1); // backtracking

        // no choice
        printPaths(n - 1, k, output);
    }

    public List<List<Integer>> combine(int n, int k) {
        ways = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        printPaths(n, k, output);
        return ways;
    }
}

// APPROACH : 2

// time = O(n^k) ; space = O(k);

class Solution {
    List<List<Integer>> ways;

    public void printPaths(int n, int k, List<Integer> output, int last) {
        if (k == 0) {
            ways.add(new ArrayList<>(output)); // deep copy
            return; // positive base case
        }
        for (int item = last + 1; item <= n; item++) {
            output.add(item);
            printPaths(n, k - 1, output, item);
            output.remove(output.size() - 1); // backtracking
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        ways = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        printPaths(n, k, output, 0);
        return ways;
    }
}