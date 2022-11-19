// https://www.interviewbit.com/problems/painters-partition-problem/
// Time = O(N * Log N), Space = O(1)
// Similar to Book Allocation
class Solution {
    public static boolean isPossible(int[] pages, long maxLoad, long totalStud) {
        long requiredStud = 1, currentLoad = 0;

        for (int book : pages) {
            if (currentLoad + book <= maxLoad) {
                currentLoad += book;
            } else {
                requiredStud++;
                currentLoad = book;
            }
        }

        return (requiredStud <= totalStud);
    }

    public static int maxOfArray(int[] pages) {
        int max = 0;
        for (int book : pages)
            max = Math.max(max, book);
        return max;
    }

    public static int sumOfArray(int[] pages) {
        int sum = 0;
        for (int book : pages)
            sum += book;
        return sum;
    }

    public int paint(int stud, int time, int[] pages) {
        long left = maxOfArray(pages); // Someone will have to read the max pages book
        long right = sumOfArray(pages); // Someone might have to read all the books

        while (left <= right) {
            long mid = left + (right - left) / 2l;
            if (isPossible(pages, mid, stud) == true)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return (int) ((left * time) % 10000003);
    }
}