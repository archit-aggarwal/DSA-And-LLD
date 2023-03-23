import java.util.*;
// https://leetcode.com/problems/two-city-scheduling/description/

// Approach 1: Using Comparable
// Time = O(N * Log N), Space = O(N)

class Solution1 {
    public static class Pair implements Comparable<Pair> {
        int costA, costB;

        Pair(int costA, int costB) {
            this.costA = costA;
            this.costB = costB;
        }

        @Override
        public int compareTo(Pair other) {
            // other -> higher priority -> swapping -> return +ve value
            // this -> higher priority -> dont swap -> return -ve value
            double profit1 = this.costB - this.costA;
            double profit2 = other.costB - other.costA;
            if (profit1 >= profit2)
                return -1;
            return +1;
        }
    }

    public int twoCitySchedCost(int[][] costs) {
        ArrayList<Pair> people = new ArrayList<>();
        for (int[] cost : costs)
            people.add(new Pair(cost[0], cost[1]));

        Collections.sort(people);

        int totalCost = 0;
        for (int i = 0; i < costs.length / 2; i++)
            totalCost += people.get(i).costA;

        for (int i = costs.length / 2; i < costs.length; i++)
            totalCost += people.get(i).costB;

        return totalCost;
    }
}

// Approach 2: Using Lamdba Expression
// Time = O(N * Log N), Space = O(1) Constant Extra Space

class Solution2 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int total = 0;
        for (int idx = 0; idx < costs.length / 2; idx++)
            total += costs[idx][0];
        for (int idx = costs.length / 2; idx < costs.length; idx++)
            total += costs[idx][1];

        return total;
    }
}