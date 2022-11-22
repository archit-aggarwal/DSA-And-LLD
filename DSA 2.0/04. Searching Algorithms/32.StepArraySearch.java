// https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1

// Love Babbar Sheet Problem
// Time = O(N) Linear Search Worst Case, O(N / K) Avg Case
// Using Jump Search Algorithm

class Complete {
    public static int search(int arr[], int n, int target, int jump) {
        int idx = 0;

        while (idx < n) {
            if (arr[idx] == target)
                return idx;

            int requiredJump = Math.abs(arr[idx] - target);
            int minJumps = requiredJump / jump; // floor division
            if (requiredJump % jump != 0)
                minJumps++; // ceil division

            idx = idx + minJumps;
        }

        return -1;
    }
}