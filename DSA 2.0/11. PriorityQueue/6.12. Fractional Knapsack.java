import java.util.*;
// https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

// Time = O(N Log N), Space = O(N) Extra Space
class Solution {
    // Higher Profit Per Kg => Higher Priority
    static class ItemCompare implements Comparator<Item> {
        public int compare(Item i1, Item i2) {
            double price1 = ((double) i1.value) / i1.weight;
            double price2 = ((double) i2.value) / i2.weight;
            if (price1 >= price2)
                return -1;
            return +1;
        }
    }

    double fractionalKnapsack(int totalWeight, Item items[], int n) {
        Arrays.sort(items, new ItemCompare());

        double profit = 0;
        for (Item i : items) {
            double price = ((double) i.value) / i.weight;
            double quant = Math.min(totalWeight, i.weight);
            profit += quant * price;
            totalWeight -= quant;
        }

        return profit;
    }
}
