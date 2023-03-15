import java.util.*;
// https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1

// Time = O(N * Log N), Space = O(1) Constant Extra Space
class Solution {
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int trains = 0, platforms = 0;
        for (int a = 0, d = 0; a < n;) {
            if (arr[a] <= dep[d]) {
                trains++;
                a++;
                platforms = Math.max(platforms, trains);
            } else {
                trains--;
                d++;
            }
        }

        return platforms;
    }
}