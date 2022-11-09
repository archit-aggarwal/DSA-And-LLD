// Leetcode 451
// https://leetcode.com/problems/sort-characters-by-frequency/description/

// Time = O(N + K), N = String's Length, K = 128 Range of Characters
// Space = O(N + K) Frequency Array & Buckets Array

class Solution {
    public String frequencySort(String s) {
        // 1. Fill the Frequency Array
        int[] freq = new int[128];
        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);
            freq[ch]++;
        }

        // 2. Fill the Buckets Array
        StringBuilder[] buckets = new StringBuilder[s.length() + 1];
        for (int idx = 0; idx < buckets.length; idx++) {
            buckets[idx] = new StringBuilder();
        }

        for (int idx = 0; idx < 128; idx++) {
            char ch = (char) idx;
            for (int c = 0; c < freq[idx]; c++) {
                buckets[freq[idx]].append(ch);
            }
        }

        // 3. Form the Resultant String (Decreasing order of Frequency)
        StringBuilder res = new StringBuilder();
        for (int idx = buckets.length - 1; idx >= 0; idx--) {
            res.append(buckets[idx]);
        }

        return res.toString();
    }
}
