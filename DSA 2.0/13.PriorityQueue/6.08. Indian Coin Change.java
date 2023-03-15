import java.util.*;
// https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
// Time = O(Amount + Notes Length), Space = O(Notes Length) Extra Space

class Solution {
    static List<Integer> minPartition(int amount) {
        int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        List<Integer> change = new ArrayList<>();
        for (int note : notes) {
            while (amount >= note) {
                change.add(note);
                amount = amount - note;
            }
        }
        return change;
    }
}