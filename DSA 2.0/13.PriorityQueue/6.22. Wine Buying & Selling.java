// https://practice.geeksforgeeks.org/problems/wine-buying-and-selling/1
// Time = O(2N) Linear, Space = O(1) Constant Extra Space
class Solution {
    long wineSelling(int arr[], int N) {
        int buy = 0, sell = 0;
        long work = 0;

        while (true) {
            while (buy < N && arr[buy] <= 0)
                buy++;
            while (sell < N && arr[sell] >= 0)
                sell++;

            if (buy == N || sell == N)
                break;

            long wines = Math.min(arr[buy], -arr[sell]);
            long dist = Math.abs(buy - sell);
            work += wines * dist;

            arr[buy] -= wines;
            arr[sell] += wines;
        }

        return work;
    }
}