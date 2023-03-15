import java.util.*;
// https://leetcode.com/problems/reorganize-string/description/
// Time = O(N * Log 26), Space = O(N) Extra Space

class Solution {
    public static class Pair implements Comparable<Pair> {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo(Pair other) {
            if (this.freq == other.freq)
                return this.ch - other.ch;
            return other.freq - this.freq;
        }
    }

    public String reorganizeString(String s) {
        // Step 1: Frequency Array
        int[] freq = new int[26];
        for (char ch : s.toCharArray())
            freq[ch - 'a']++;

        // Step 2: Priority Queue (Max Heap)
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq[ch - 'a'] == 0)
                continue;
            pq.add(new Pair(ch, freq[ch - 'a']));
        }

        // Step 3: Build the answer (no adjacent duplicate)
        StringBuilder res = new StringBuilder();
        while (pq.size() > 1) {
            Pair p1 = pq.remove();
            Pair p2 = pq.remove();

            res.append(p1.ch);
            res.append(p2.ch);
            p1.freq--;
            p2.freq--;

            if (p1.freq > 0)
                pq.add(p1);
            if (p2.freq > 0)
                pq.add(p2);
        }

        if (pq.size() == 1 && pq.peek().freq == 1)
            res.append(pq.peek().ch);
        if (pq.size() == 1 && pq.peek().freq > 1)
            return "";
        return res.toString();
    }
}