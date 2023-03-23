import java.util.*;

// https://leetcode.com/problems/candy/description/
// Time = O(3N) Linear, Space = O(2N) Linear Extra Space

class Solution {
    public int[] leftCalc(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                candies[i] = 1 + candies[i - 1];
        }
        return candies;
    }

    public int[] rightCalc(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                candies[i] = 1 + candies[i + 1];
        }
        return candies;
    }

    public int candy(int[] ratings) {
        int[] left = leftCalc(ratings);
        int[] right = rightCalc(ratings);

        int candies = 0;
        for (int i = 0; i < ratings.length; i++)
            candies += Math.max(left[i], right[i]);
        return candies;
    }
}