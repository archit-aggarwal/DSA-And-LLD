import java.util.*;

// Link: https://www.codingninjas.com/codestudio/problems/minimize-cash-flow-among-a-given-set-of-friends-who-have-borrowed-money-from-each-other_1170048
// Time = O(N Log N), Space = O(N) Extra Space 
// (Greedy Algorithm - Priority Queue Data Structure)

class Solution {
    public static class Pair implements Comparable<Pair> {
        int idx, net;

        Pair(int idx, int net) {
            this.idx = idx;
            this.net = net;
        }

        public int compareTo(Pair other) {
            if (other.net > this.net)
                return +1;
            if (other.net < this.net)
                return -1;
            return (this.idx - other.idx);
        }
    }

    public static int[][] minCashFlow(int[][] mat, int n) {
        int[] net = new int[n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                net[r] -= mat[r][c];
                net[c] += mat[r][c];
            }
        }

        mat = new int[n][n];
        PriorityQueue<Pair> debtor = new PriorityQueue<>();
        PriorityQueue<Pair> creditor = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            if (net[i] > 0)
                creditor.add(new Pair(i, net[i]));
            if (net[i] < 0)
                debtor.add(new Pair(i, -net[i]));
        }

        while (debtor.size() > 0 && creditor.size() > 0) {
            Pair debt = debtor.remove();
            Pair cred = creditor.remove();

            int amount = Math.min(debt.net, cred.net);
            mat[debt.idx][cred.idx] = amount;

            debt.net -= amount;
            cred.net -= amount;

            if (debt.net > 0)
                debtor.add(debt);
            if (cred.net > 0)
                creditor.add(cred);
        }

        return mat;
    }
}
