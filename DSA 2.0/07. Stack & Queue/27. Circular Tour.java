// https://leetcode.com/problems/gas-station/

// Time = O(N ^ 2), Space = O(1)
// Time Limit Exceeded (TLE) 
// Brute Force Approach

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int st = 0; st < n; st++) {
            int fuel = 0;
            boolean ans = true;

            for (int jump = 0; jump < n; jump++) {
                int curr = (st + jump) % n;
                fuel += gas[curr];

                if (fuel < cost[curr]) {
                    ans = false;
                    break;
                }

                fuel -= cost[curr];
            }

            if (ans == true)
                return st;
        }
        return -1;
    }
}

// Time - O(N), Space - O(1)

class Solution2 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int deficit = 0, fuel = 0, start = 0;

        for (int idx = 0; idx < gas.length; idx++) {
            fuel += gas[idx] - cost[idx];

            if (fuel < 0) {
                start = idx + 1;
                deficit += -fuel;
                fuel = 0;
            }
        }

        if (fuel >= deficit)
            return start;
        return -1;
    }
}