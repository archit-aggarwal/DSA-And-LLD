import java.util.*;

// Time = O(N * Root N * Log N), Space = O(1)
// Codestudio: https://www.codingninjas.com/codestudio/problems/cooking-ninjas_1164174?leftPanelTab=2
// Roti Prata on SPOJ

class Solution {
    public static boolean isPossible(ArrayList<Integer> cooks, int timeAllowed, int requiredDishes) {
        for (int rank : cooks) {
            int mult = 1;
            for (int timeTaken = rank; timeTaken <= timeAllowed; timeTaken += rank * mult) {
                requiredDishes--;
                mult++;
                if (requiredDishes == 0)
                    return true;
            }
        }
        return false;
    }

    public static int minCookTime(ArrayList<Integer> cooks, int dishes) {
        Collections.sort(cooks); // Fastest Cook is assigned first
        int left = 1, right = (cooks.get(0) * dishes * (dishes + 1)) / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(cooks, mid, dishes) == true) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
