// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
// Binary Search on Answer
// Time = O(N * Log N), Space = O(1)

// More Links to Submit:
// Split Array Largest Sum: https://leetcode.com/problems/split-array-largest-sum/
// Capacity to Ship Packages: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    // Can I Distribute all books to the totalStudents within maximum load
    public static boolean isPossible(int[] pages, int maxLoad, int totalStud) {
        int requiredStud = 1, currentLoad = 0;

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

    public static int findPages(int[] pages, int books, int stud) {
        if (books < stud)
            return -1; // some students will not get any book

        int left = maxOfArray(pages); // Someone will have to read the max pages book
        int right = sumOfArray(pages); // Someone might have to read all the books

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(pages, mid, stud) == true)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }
}