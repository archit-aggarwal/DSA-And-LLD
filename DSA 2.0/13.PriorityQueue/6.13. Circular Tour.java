// https://leetcode.com/problems/gas-station/description/
// Time = O(N), Space = O(1) Constant Extra Space

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, fuel = 0, deficit = 0;

        for (int i = 0; i < gas.length; i++) {
            fuel += (gas[i] - cost[i]);

            if (fuel < 0) {
                deficit -= fuel;
                start = i + 1;
                fuel = 0;
            }
        }

        if (fuel >= deficit)
            return start;
        return -1;
    }
}
